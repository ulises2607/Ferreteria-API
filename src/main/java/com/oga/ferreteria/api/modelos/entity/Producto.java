package com.oga.ferreteria.api.modelos.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="producto")
public class Producto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_producto;
	
	private Long id_categoria;
	private Long id_sector;
	
	private Long codigo_producto;
	private String nombre_producto;
	private Long stock_producto;
	private Double precio_producto;
	
	@Column(name="fecha_alta_producto")
	@Temporal(TemporalType.DATE)
	private Date fecha_alta_producto;
	
	@Column(name="fecha_modificacion_producto")
	@Temporal(TemporalType.DATE)
	private Date fecha_modificacion_producto;
	
	private String descripcion_producto;
	private Double decuento_producto;
	private Short estado_producto;
	private Long stock_minimo;
	private byte[] imagen;

	// Setter y Getters
	public Long getId_producto() {
		return id_producto;
	}

	public void setId_producto(Long id_producto) {
		this.id_producto = id_producto;
	}

	public Long getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(Long id_categoria) {
		this.id_categoria = id_categoria;
	}

	public Long getId_sector() {
		return id_sector;
	}

	public void setId_sector(Long id_sector) {
		this.id_sector = id_sector;
	}

	public Long getCodigo_producto() {
		return codigo_producto;
	}

	public void setCodigo_producto(Long codigo_producto) {
		this.codigo_producto = codigo_producto;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public Long getStock_producto() {
		return stock_producto;
	}

	public void setStock_producto(Long stock_producto) {
		this.stock_producto = stock_producto;
	}

	public Double getPrecio_producto() {
		return precio_producto;
	}

	public void setPrecio_producto(Double precio_producto) {
		this.precio_producto = precio_producto;
	}

	public Date getFecha_alta_producto() {
		return fecha_alta_producto;
	}

	public void setFecha_alta_producto(Date fecha_alta_producto) {
		this.fecha_alta_producto = fecha_alta_producto;
	}

	public Date getFecha_modificacion_producto() {
		return fecha_modificacion_producto;
	}

	public void setFecha_modificacion_producto(Date fecha_modificacion_producto) {
		this.fecha_modificacion_producto = fecha_modificacion_producto;
	}

	public String getDescripcion_producto() {
		return descripcion_producto;
	}

	public void setDescripcion_producto(String descripcion_producto) {
		this.descripcion_producto = descripcion_producto;
	}

	public Double getDecuento_producto() {
		return decuento_producto;
	}

	public void setDecuento_producto(Double decuento_producto) {
		this.decuento_producto = decuento_producto;
	}

	public Short getEstado_producto() {
		return estado_producto;
	}

	public void setEstado_producto(Short estado_producto) {
		this.estado_producto = estado_producto;
	}

	public Long getStock_minimo() {
		return stock_minimo;
	}

	public void setStock_minimo(Long stock_minimo) {
		this.stock_minimo = stock_minimo;
	}

	public byte[] getImagen() {
		return imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}

}
