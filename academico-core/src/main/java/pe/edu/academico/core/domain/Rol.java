package pe.edu.academico.core.domain;

import java.io.Serializable;

public class Rol extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 0L;
	
	private String nombre;
	private String descripcion;
	private String estado;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
