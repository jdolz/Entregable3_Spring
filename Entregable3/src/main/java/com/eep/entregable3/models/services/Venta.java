package com.eep.entregable3.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.eep.entregable3.models.domain.Carrito;
import com.eep.entregable3.models.domain.Cliente;
import com.eep.entregable3.models.domain.Factura;


@Component
public class Venta implements Vendible {
	
	@Autowired
	Factura f1;

	@Override
	public Factura vender(Carrito carrito, Cliente cliente) {
		

		f1.setItems(carrito.getItems());
		f1.setCliente(cliente);
		
		f1.setDescripcion(f1.calcularImporte() + " €");

		return f1;
	}

}
