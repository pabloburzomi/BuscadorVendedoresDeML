package com.pabloburzomi.jsf.web;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

import com.pabloburzomi.MLARest.RestRequest;
import com.pabloburzomi.MLARest.DTO.ProductoRest;
import com.pabloburzomi.MLARest.DTO.Result;
import com.pabloburzomi.MLARest.DTO.Seller;
import com.pabloburzomi.MLARest.meli.VendedorRestRequest;

@ManagedBean
@RequestScoped
public class nickNameBean {
	
	final String URLAPI = "https://api.mercadolibre.com/sites/MLA/search?nickname="; 
	private String nickUsuario;
	private static ProductoRest vendedorMla;
	private Seller seller;
	private String nickName;
	private Long id;
	private String fechaRegistro;
	private String link;
	private double reputacionPositiva;
	private double reputacionNegativa;
	private double reputacionNeutral;
	private Long totalTransacciones;
	private Long totalCompletadas;
	private Long totalCanceladas;
	private List<Result> result;
	private String titulo;
	

	public String nick() {

		return "buscador";

	}
        
        
	public String inicio() {
		
		nickUsuario = "";
		return "index";
	}

	public String vendedor() {
		
		if (nickUsuario.contains(" ")) { 
			
			List<String> var2 = Arrays.asList(nickUsuario.split(" ", nickUsuario.length()-1));
			nickUsuario = var2.stream().collect(Collectors.joining("+")).toString();
		} 
		
		
		
		String url = URLAPI + nickUsuario;

		RestRequest<ProductoRest> peticionRest = new VendedorRestRequest(url);
		
		
		
		try {

			vendedorMla = peticionRest.executeRestCall();
			
			fechaRegistro = vendedorMla.getSeller().getRegistrationDate();
			nickName = vendedorMla.getSeller().getNickname();
			id = vendedorMla.getSeller().getId();
			link = vendedorMla.getSeller().getPermalink();
			reputacionPositiva = vendedorMla.getSeller().getSellerReputation().getTransactions().getRatings()
					.getPositive();
			reputacionNegativa = vendedorMla.getSeller().getSellerReputation().getTransactions().getRatings()
					.getNegative();
			reputacionNeutral = vendedorMla.getSeller().getSellerReputation().getTransactions().getRatings()
					.getNeutral();
			totalCompletadas = vendedorMla.getSeller().getSellerReputation().getTransactions().getCompleted();
			totalCanceladas = vendedorMla.getSeller().getSellerReputation().getTransactions().getCanceled();
			totalTransacciones = vendedorMla.getSeller().getSellerReputation().getTransactions().getTotal();

		} catch (NullPointerException e) {

			return "noExiste";
			
		} catch(Exception ex) {
                    
			
                    System.out.println("Hubo el siguiente error: " + ex.getMessage());
			
		}

		return "buscador";

	}
	

	public String showProducts() {
		
		
		result = vendedorMla.getResults();
		
		return "productos";

	}

	public String getNickUsuario() {
		return nickUsuario;
	}

	public void setNickUsuario(String nick) {

		this.nickUsuario = nick;
	}

	public ProductoRest getVendedorMla() {
		return vendedorMla;
	}


	public static void setVendedorMla(ProductoRest vendedorMla) {
		nickNameBean.vendedorMla = vendedorMla;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public double getReputacionPositiva() {
		return reputacionPositiva;
	}

	public void setReputacionPositiva(double reputacionPositiva) {
		this.reputacionPositiva = reputacionPositiva;
	}

	public double getReputacionNegativa() {
		return reputacionNegativa;
	}

	public void setReputacionNegativa(double reputacionNegativa) {
		this.reputacionNegativa = reputacionNegativa;
	}

	public double getReputacionNeutral() {
		return reputacionNeutral;
	}

	public void setReputacionNeutral(double reputacionNeutral) {
		this.reputacionNeutral = reputacionNeutral;
	}

	public Long getTotalTransacciones() {
		return totalTransacciones;
	}

	public void setTotalTransacciones(Long totalTransacciones) {
		this.totalTransacciones = totalTransacciones;
	}

	public Long getTotalCompletadas() {
		return totalCompletadas;
	}

	public void setTotalCompletadas(Long totalCompletadas) {
		this.totalCompletadas = totalCompletadas;
	}

	public Long getTotalCanceladas() {
		return totalCanceladas;
	}

	public void setTotalCanceladas(Long totalCanceladas) {
		this.totalCanceladas = totalCanceladas;
	}

	public List<Result> getResult() {
		return result;
	}

	public void setResult(List<Result> result) {
		this.result = result;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	
	

}
