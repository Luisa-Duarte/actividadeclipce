package com.adso.crudinventario.springbootadso.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

import jakarta.persistence.Table;


@Entity
@Table(name="productos")
public class Producto {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String marca;
	private String categoria;
	private double precio;
	
	@Column(columnDefinition= "text")
	private String descripcion;
	private Date fechaCreacion;
	private String nombreArchivoimagen;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public String getNombreArchivoimagen() {
		return nombreArchivoimagen;
	}
	public void setNombreArchivoimagen(String nombreArchivoimagen) {
		this.nombreArchivoimagen = nombreArchivoimagen;
	}
	
	
	
	
	
	

}
