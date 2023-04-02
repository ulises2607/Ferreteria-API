package com.oga.ferreteria.api.modelos.services;

import java.util.List;

import com.oga.ferreteria.api.modelos.entity.Producto;

public interface IProductoService {
	
	public List<Producto> FindAll();
	
}
