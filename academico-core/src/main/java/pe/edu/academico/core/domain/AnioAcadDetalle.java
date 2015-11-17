package pe.edu.academico.core.domain;

import java.io.Serializable;

public class AnioAcadDetalle extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 0L;
	
	private Nivel nivel;
	private AnioAcademico anioAcademico;
	
	public Nivel getNivel() {
		return nivel;
	}
	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}
	public AnioAcademico getAnioAcademico() {
		return anioAcademico;
	}
	public void setAnioAcademico(AnioAcademico anioAcademico) {
		this.anioAcademico = anioAcademico;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
