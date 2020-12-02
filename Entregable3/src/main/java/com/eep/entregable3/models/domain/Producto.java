package com.eep.entregable3.models.domain;

public class Producto {
	private String nombre;
	private Double precio;
	private TiposIVA Tipo;

	public Producto() {
		
	}

	
	public Producto(String nombre, Double precio, TiposIVA tipo) {
		this.nombre = nombre;
		this.precio = precio;
		Tipo = tipo;
	}



	public TiposIVA getTipo() {
		return Tipo;
	}



	public void setTipo(TiposIVA tipo) {
		Tipo = tipo;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

}
