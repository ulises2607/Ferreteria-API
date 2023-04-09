package com.oga.ferreteria.api.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.oga.ferreteria.api.modelos.entity.Producto;
import com.oga.ferreteria.api.modelos.services.IProductoService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ProductoController {
	
	@Autowired
	private IProductoService productoService;

	@GetMapping("/producto/getProductos")
	public List<Producto> getProductos(){
		return productoService.FindAll();
	}
	
	@GetMapping("/producto/{id}")
	public Producto show(@PathVariable Long id) {
		return productoService.findById(id);
	}
	
	@PostMapping("/producto")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto create(@RequestBody Producto producto) {
		
		return productoService.save(producto);
	}
	
	@PutMapping("/producto/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto update(@RequestBody Producto producto, @PathVariable Long id) {
		
		Producto productoActual = productoService.findById(id);
		
		productoActual.setId_categoria(producto.getId_categoria());
		productoActual.setCodigo_producto(producto.getCodigo_producto());
		productoActual.setNombre_producto(producto.getNombre_producto());
		productoActual.setStock_producto(producto.getStock_producto());
		productoActual.setPrecio_producto(producto.getPrecio_producto());
		productoActual.setFecha_alta_producto(producto.getFecha_alta_producto());
		productoActual.setFecha_modificacion_producto(new Date());
		productoActual.setDescripcion_producto(producto.getDescripcion_producto());
		productoActual.setDecuento_producto(producto.getDecuento_producto());
		productoActual.setEstado_producto(producto.getEstado_producto());
		productoActual.setStock_minimo(producto.getStock_minimo());
		productoActual.setImagen(null);
		
		return productoService.save(productoActual);
		
	}
	
	@DeleteMapping("/producto/{id}")
	public void delete(@PathVariable Long id) {
		productoService.delete(id);
	}
	
}



