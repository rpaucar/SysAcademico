package pe.edu.academico.core.domain;

import java.io.Serializable;

public class Nivel extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 0L;
	
	private String nombre;
	private String estado;
	private String descripcion;
	private String numeroNivel;
	
	
	public String getNumeroNivel() {
		return numeroNivel;
	}
	public void setNumeroNivel(String numeroNivel) {
		this.numeroNivel = numeroNivel;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
