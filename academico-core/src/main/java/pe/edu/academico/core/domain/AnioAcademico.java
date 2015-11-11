package pe.edu.academico.core.domain;

import java.io.Serializable;
import java.util.Date;

public class AnioAcademico extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 0L;

	// private Long faseId;
	private String estado;
	private Date fecha_cierre_nomina;
	private String anio_escolar;
	private String nombre;
	private Date fecha_inicio;
	private Date fecha_fin;
	private FaseAnioAcad faseAnioAcad;

	public FaseAnioAcad getFaseAnioAcad() {
		return faseAnioAcad;
	}

	public void setFaseAnioAcad(FaseAnioAcad faseAnioAcad) {
		this.faseAnioAcad = faseAnioAcad;
	}

	// public Long getFaseId() {
	// return faseId;
	// }
	// public void setFaseId(Long faseId) {
	// this.faseId = faseId;
	// }
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFecha_cierre_nomina() {
		return fecha_cierre_nomina;
	}

	public void setFecha_cierre_nomina(Date fecha_cierre_nomina) {
		this.fecha_cierre_nomina = fecha_cierre_nomina;
	}

	public String getAnio_escolar() {
		return anio_escolar;
	}

	public void setAnio_escolar(String anio_escolar) {
		this.anio_escolar = anio_escolar;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
