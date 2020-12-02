package com.eep.entregable3.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.eep.entregable3.models.domain.Carrito;
import com.eep.entregable3.models.domain.Cliente;
import com.eep.entregable3.models.domain.Factura;
import com.eep.entregable3.models.domain.ItemCarrito;
import com.eep.entregable3.models.domain.TiposIVA;
import com.eep.entregable3.models.domain.TiposTarjeta;
import com.eep.entregable3.models.services.Vendible;

@Controller
@RequestMapping("/tienda")
public class ItemCarritoController {

	public static final String VISTA_FORMULARIO = "formularioCarrito";
	
	@Autowired
	ItemCarrito item;

	@Autowired
	Carrito carrito;


	@GetMapping("/formulario")
	public ModelAndView formulario() {
		ModelAndView mav = new ModelAndView(VISTA_FORMULARIO);
		mav.addObject("itemCarrito", item);
		mav.addObject("carrito", carrito);
		mav.addObject("tiposIVA", verTiposDeIVA());
		return mav;
	}

	@GetMapping("/comprar")
	public ModelAndView comprar(@ModelAttribute("itemCarrito") ItemCarrito itemCarrito) {
		carrito.aniadirItem(itemCarrito); // guardando en Java
		carrito.mostrarContenido();
		return new ModelAndView("redirect:/tienda/formulario");
	}


	public List<TiposIVA> verTiposDeIVA() {
		return Arrays.asList(TiposIVA.values());
	}

}
