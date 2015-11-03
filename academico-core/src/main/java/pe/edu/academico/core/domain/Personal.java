package pe.edu.academico.core.domain;

import java.io.Serializable;

public class Personal extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 0L;
	
	private String estado;
	private Long personaId;
	private Long rolId;
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Long getPersonaId() {
		return personaId;
	}
	public void setPersonaId(Long personaId) {
		this.personaId = personaId;
	}
	public Long getRolId() {
		return rolId;
	}
	public void setRolId(Long rolId) {
		this.rolId = rolId;
	}
}
