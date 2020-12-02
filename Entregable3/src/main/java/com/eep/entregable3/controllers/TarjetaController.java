package com.eep.entregable3.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.eep.entregable3.models.domain.Cliente;
import com.eep.entregable3.models.domain.TiposTarjeta;

@Controller
@RequestMapping("/tienda")
public class TarjetaController {
	
	public static final String VISTA_TARJETA = "datosTarjeta";
	
	@Autowired
	Cliente cliente;
	
	@GetMapping("/datosTarjeta")
	public ModelAndView formularioTarjeta(@ModelAttribute("cliente") Cliente cli) {
		cli.mostrarContenido1();
		cliente.mostrarContenido1();
		
		cliente.setNombre(cli.getNombre());
		cliente.setApellido(cli.getApellido());
		cliente.setDesempleado(cli.getDesempleado());
		cliente.setFamiliaNumerosa(cli.getFamiliaNumerosa());
		
		ModelAndView mav = new ModelAndView(VISTA_TARJETA);
		cliente.mostrarContenido1();
		mav.addObject("cliente", cliente);
		mav.addObject("tiposTarjeta", verTiposDeTarjeta());
		return mav;
	}
	
	public List<TiposTarjeta> verTiposDeTarjeta() {
		return Arrays.asList(TiposTarjeta.values());
	}

}
