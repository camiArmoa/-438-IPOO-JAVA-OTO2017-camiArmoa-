package com.camiarmoa.ipoo.repuestos.datos.cliente;

public class Producto {
	//propiedades
	private int id;
	private String nombre;
	private String codigo;
	
	public Producto(){
		
	}
	//constructor 2
	public Producto(int id, String nombre, String codigo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.codigo = codigo;
	}
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
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
}
