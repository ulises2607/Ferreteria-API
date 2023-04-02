package com.oga.ferreteria.api.modelos.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sector")
public class Sector implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_sector;

	private String descripcion_sector;
	
	// Setter y getters
	public Long getId_sector() {
		return id_sector;
	}

	public void setId_sector(Long id_sector) {
		this.id_sector = id_sector;
	}

	public String getDescripcion_sector() {
		return descripcion_sector;
	}

	public void setDescripcion_sector(String descripcion_sector) {
		this.descripcion_sector = descripcion_sector;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
