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
		// TODO Auto-generated method stub
		return (List<Producto>) productoDao.findAll();
	}
	
}
