package com.eep.entregable3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.eep.entregable3.models.domain.Cliente;

@Controller
@RequestMapping("/tienda")
public class ClienteController {

	public static final String VISTA_CLIENTES = "formularioCliente";
	
	@Autowired
	Cliente cliente;
	
	@GetMapping("/formularioUsuario")
	public ModelAndView formularioUsuarios() {
		ModelAndView mav = new ModelAndView(VISTA_CLIENTES);
		
		cliente.mostrarContenido1();
		mav.addObject("cliente", cliente);

		return mav;
	}
	
}
