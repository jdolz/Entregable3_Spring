package com.eep.entregable3.models.domain;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Component
@RequestScope
public class Factura {

	private String descripcion;

	private Cliente cliente;

	private List<ItemCarrito> items; // carrito

	public Factura() {

	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemCarrito> getItems() {
		return items;
	}

	public void setItems(List<ItemCarrito> items) {
		this.items = items;
	}

	public Integer calcularImporte() {
		Integer total = 0;

		for (ItemCarrito itemCarrito : items) {
			total += itemCarrito.calcularImporte();
		}
		return total;
		
	}
	public Double calcularImporteConIVA() {
		Double total = 0.0;

		for (ItemCarrito itemCarrito : items) {
			total += itemCarrito.calcularImporteConIVA();
		}
		if (cliente.getDesempleado() && cliente.getFamiliaNumerosa()) {
			total -=  total*15/100;
		} else {
			if (cliente.getDesempleado()) {
				total -=  total*5/100;	
			}

			if (cliente.getFamiliaNumerosa()) {
				total -=  total*10/100;
			}
		}

		return Math.round(total*100d)/100d; // IVA
	}

}
