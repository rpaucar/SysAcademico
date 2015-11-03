package pe.edu.academico.core.domain;

import java.io.Serializable;
import java.util.Date;

public class Turno extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 0L;
	
	private String nombre;
	private Date hora_inicio;
	private Date hora_fin;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getHora_inicio() {
		return hora_inicio;
	}
	public void setHora_inicio(Date hora_inicio) {
		this.hora_inicio = hora_inicio;
	}
	public Date getHora_fin() {
		return hora_fin;
	}
	public void setHora_fin(Date hora_fin) {
		this.hora_fin = hora_fin;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
