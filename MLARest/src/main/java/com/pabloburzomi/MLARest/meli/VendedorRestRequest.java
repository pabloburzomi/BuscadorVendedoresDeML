package com.pabloburzomi.MLARest.meli;

import javax.ws.rs.core.Response;

import com.pabloburzomi.MLARest.RestRequest;
import com.pabloburzomi.MLARest.DTO.ProductoRest;


public class VendedorRestRequest extends RestRequest<ProductoRest>{

	public VendedorRestRequest(String urlApi) {
		super(urlApi);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected ProductoRest buildResponseDTO(Response response) {
		
		ProductoRest pr = response.readEntity(ProductoRest.class);
		
		return pr;
		
		
	}

}
