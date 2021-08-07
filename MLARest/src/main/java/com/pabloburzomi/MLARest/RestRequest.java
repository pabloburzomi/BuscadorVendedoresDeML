package com.pabloburzomi.MLARest;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.logging.LoggingFeature;

public abstract class RestRequest<T> {

	protected String urlApi;

	public RestRequest(String urlApi) {

		this.urlApi = urlApi;
	}

	public T executeRestCall() throws Exception {

		Client client = ClientBuilder.newClient(new ClientConfig().register(LoggingFeature.class));

		WebTarget webTarget = this.buildWebTarget(client);
		Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);

		Response response = this.buildResponse(invocationBuilder);
		

		if (Status.OK.getStatusCode() != response.getStatus()) {
			throw new Exception(response.getStatusInfo().getReasonPhrase());
		}

		T responseT = this.buildResponseDTO(response);

		return responseT;

	}
	
	protected abstract T buildResponseDTO(Response response);
	

	private Response buildResponse(Builder invocationBuilder) {
		return invocationBuilder.get();
	}
	
	protected WebTarget buildWebTarget(Client client) {
		return client.target(getUrlApi());
	}

	public String getUrlApi() {
		return urlApi;
	}
	
	

}
