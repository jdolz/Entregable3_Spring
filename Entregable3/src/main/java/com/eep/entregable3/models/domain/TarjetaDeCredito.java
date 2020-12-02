package com.eep.entregable3.models.domain;

public class TarjetaDeCredito {
	private TiposTarjeta Tipo;
	private String numero;
	private int mesCaducidad;
	private int anioCaducidad;
	private int numeroSecreto;
	
	
	public TarjetaDeCredito() {
		
	}
	public TiposTarjeta getTipo() {
		return Tipo;
	}
	public void setTipo(TiposTarjeta tipo) {
		Tipo = tipo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getMesCaducidad() {
		return mesCaducidad;
	}
	public void setMesCaducidad(int mesCaducidad) {
		this.mesCaducidad = mesCaducidad;
	}
	public int getAnioCaducidad() {
		return anioCaducidad;
	}
	public void setAnioCaducidad(int anioCaducidad) {
		this.anioCaducidad = anioCaducidad;
	}
	public int getNumeroSecreto() {
		return numeroSecreto;
	}
	public void setNumeroSecreto(int numeroSecreto) {
		this.numeroSecreto = numeroSecreto;
	}
	
	

}
