package com.oga.ferreteria.api.modelos.dao;

import org.springframework.data.repository.CrudRepository;

import com.oga.ferreteria.api.modelos.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto,Long>{
	
}
