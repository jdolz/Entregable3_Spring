package com.eep.entregable3.models.domain;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class ItemCarrito {

	private Producto producto;
	private Integer cantidad;

	public ItemCarrito() {

	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Integer calcularImporte() {

		return (int) (cantidad * producto.getPrecio()); // IVA
	}

	public Double calcularImporteConIVA() {
		Double importe = producto.getPrecio();

		if (producto.getTipo() == null) {
			producto.setTipo(TiposIVA.NORMAL);
		}

		switch (producto.getTipo()) {
		case SUPER_REDUCIDO:
			importe += importe * 2 / 100;
			break;
		case REDUCIDO:
			importe += importe * 8 / 100;
			break;
		case NORMAL:
			importe += importe * 21 / 100;
			break;
		case LUJO:
			importe += importe * 40 / 100;
			break;

		default:
			break;
		}
		return Math.round((cantidad * importe) * 100d) / 100d; // IVA
	}

}
