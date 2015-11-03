package pe.edu.academico.core.domain;

import java.io.Serializable;

public class Responsable extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 0L;
	
	private String estado;
	private String lugar_trabajo;
	private Long personaId;
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getLugar_trabajo() {
		return lugar_trabajo;
	}
	public void setLugar_trabajo(String lugar_trabajo) {
		this.lugar_trabajo = lugar_trabajo;
	}
	public Long getPersonaId() {
		return personaId;
	}
	public void setPersonaId(Long personaId) {
		this.personaId = personaId;
	}	
}
