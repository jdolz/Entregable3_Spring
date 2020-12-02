package com.eep.entregable3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.eep.entregable3.models.domain.Carrito;
import com.eep.entregable3.models.domain.Cliente;
import com.eep.entregable3.models.services.Vendible;


@Controller
@RequestMapping("/tienda")
public class FacturaController {
	public static final String VISTA_FACTURA = "datosFactura";

	@Autowired
	Carrito carrito;
	
	@Autowired
	Cliente cliente;
	
	@Autowired
	Vendible vendible;
	
	@GetMapping("/datosFactura")
	public ModelAndView datosFactura(@ModelAttribute("cliente") Cliente cli) {
		cli.mostrarContenido2();
		cliente.setTarjeta(cli.getTarjeta());
		
		cliente.mostrarContenido1();
		cliente.mostrarContenido2();
		ModelAndView mav = new ModelAndView(VISTA_FACTURA);

		mav.addObject("factura", vendible.vender(carrito, cliente));

		return mav;
	}
	
}
