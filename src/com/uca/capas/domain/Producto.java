package com.uca.capas.domain;

import java.util.Date;

import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class Producto {
	@Size(message="La longitud maxima de 30 caracteres", min=0,max=30)
	@NotEmpty(message="Este campo no puede ser vacio")
	private String nombre;
	
	@Size(message="La longitud maxima de 30 caracteres", min=0,max=30)
	@NotEmpty(message="Este campo no puede ser vacio")
	private String marca;
	
	@Size(message="La longitud maxima de 30 caracteres", min=0,max=30)
	@NotEmpty(message="Este campo no puede ser vacio")
	private String descripcion;
	
	@Size(message="La longitud maxima de 30 caracteres", min=0,max=30)
	@NotEmpty(message="Este campo no puede ser vacio")
	private String categoria;
	
	@PositiveOrZero(message="no puede ser negativo")
	private float precio;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fecha;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}	
}
