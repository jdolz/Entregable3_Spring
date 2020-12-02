package com.eep.entregable3.models.domain;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;


@Component
@SessionScope
public class Cliente {

	private String nombre;
	private String apellido;
	private TarjetaDeCredito tarjeta;
	private boolean familiaNumerosa;
	private boolean desempleado;

	public Cliente() {
	}

	

	
	public Cliente(String nombre, String apellido, TarjetaDeCredito tarjeta, boolean familiaNumerosa,
			boolean desempleado) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.tarjeta = tarjeta;
		this.familiaNumerosa = familiaNumerosa;
		this.desempleado = desempleado;
	}


	public boolean getFamiliaNumerosa() {
		return familiaNumerosa;
	}

	public void setFamiliaNumerosa(boolean familiaNumerosa) {
		this.familiaNumerosa = familiaNumerosa;
	}

	public boolean getDesempleado() {
		return desempleado;
	}

	public void setDesempleado(boolean desempleado) {
		this.desempleado = desempleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public TarjetaDeCredito getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(TarjetaDeCredito tarjeta) {
		this.tarjeta = tarjeta;
	}

	public void mostrarContenido1() {
		System.out.println("---Cliente---");

		System.out.print(this.getNombre() + "-" + this.getApellido()+ "-" + this.getDesempleado() + "-" + this.getFamiliaNumerosa());
	}

	public void mostrarContenido2() {
		System.out.println("---Cliente---");

		System.out.print(this.getNombre() + "-" + this.getApellido() + "-" + this.getTarjeta().getAnioCaducidad() + "-"
				+ this.getTarjeta().getMesCaducidad() + "-" + this.getTarjeta().getNumero() + "-"
				+ this.getTarjeta().getNumeroSecreto() + "-" + this.getTarjeta().getTipo());
	}
}
