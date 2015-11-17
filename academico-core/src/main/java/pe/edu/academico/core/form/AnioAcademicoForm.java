package pe.edu.academico.core.form;

import java.util.Date;

import pe.edu.academico.core.domain.FaseAnioAcad;

public class AnioAcademicoForm {

    private String id;
	private String estado;
	private String fecha_cierre_nomina;
	private String anio_escolar;
	private String nombre;
	private String fecha_inicio;
	private String fecha_fin;
	private String IdFaseAnioAcad;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getFecha_cierre_nomina() {
		return fecha_cierre_nomina;
	}
	public void setFecha_cierre_nomina(String fecha_cierre_nomina) {
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
	public String getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public String getFecha_fin() {
		return fecha_fin;
	}
	public void setFecha_fin(String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	public String getIdFaseAnioAcad() {
		return IdFaseAnioAcad;
	}
	public void setIdFaseAnioAcad(String idFaseAnioAcad) {
		IdFaseAnioAcad = idFaseAnioAcad;
	}
	
	
}
