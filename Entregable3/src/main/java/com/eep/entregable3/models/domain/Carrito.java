package com.eep.entregable3.models.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class Carrito {

	private List<ItemCarrito> items;
	
	public Carrito() {

		this.items = new ArrayList<ItemCarrito>();
	}

	

	public List<ItemCarrito> getItems() {
		return items;
	}

	public void setItems(List<ItemCarrito> items) {
		this.items = items;
	}

	public void aniadirItem(ItemCarrito item) {
		//if(item.getProducto().getNombre() != null && item.getProducto().getPrecio() != null && item.getCantidad() != null)
		
		this.items.add(item);
	}
	
	public void mostrarContenido() {
        System.out.println("---Carrito---");
        for (int i = 0; i < this.items.size(); i++) {
            System.out.print(this.items.get(i).getProducto().getNombre() 
                    + "-" + this.items.get(i).getProducto().getPrecio() + "-" 
                    + this.items.get(i).getCantidad());
        }
    }

	
}
