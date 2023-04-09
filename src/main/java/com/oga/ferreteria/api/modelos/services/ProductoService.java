package com.oga.ferreteria.api.modelos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oga.ferreteria.api.modelos.dao.IProductoDao;
import com.oga.ferreteria.api.modelos.entity.Producto;


@Service
public class ProductoService implements IProductoService{

	@Autowired
	private IProductoDao productoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Producto> FindAll() {
		
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {
		
		return productoDao.findById(id).orElse(null);
	}
	@Transactional
	@Override
	public Producto save(Producto producto) {
		
		return productoDao.save(producto);
	}
	@Override
	@Transactional
	public void delete(Long id) {
		productoDao.deleteById(id);
		
	}
	
}
