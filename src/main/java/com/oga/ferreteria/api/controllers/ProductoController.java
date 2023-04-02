package com.oga.ferreteria.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oga.ferreteria.api.modelos.entity.Producto;
import com.oga.ferreteria.api.modelos.services.IProductoService;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {
	
	@Autowired
	private IProductoService productoService;

	@GetMapping("/getProductos")
	public List<Producto> getProductos(){
		return productoService.FindAll();
	}
}
