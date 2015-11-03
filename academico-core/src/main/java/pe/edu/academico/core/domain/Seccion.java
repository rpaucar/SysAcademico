package pe.edu.academico.core.domain;

import java.io.Serializable;

public class Seccion extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 0L;
	
	private String nombre;
	private String detalle;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
}
