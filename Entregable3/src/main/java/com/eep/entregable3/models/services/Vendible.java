package com.eep.entregable3.models.services;

import com.eep.entregable3.models.domain.Carrito;
import com.eep.entregable3.models.domain.Cliente;
import com.eep.entregable3.models.domain.Factura;

public interface Vendible {
	
	public Factura vender(Carrito carrito, Cliente cliente);

}
