package pe.edu.academico.core.domain;

import java.io.Serializable;
import java.util.Date;

public class Alumno extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 0L;
	
	private String codigo_alumno;
	private String estado;
	private String usuario_creacion;
	private String usuario_actualizacion;
	private String ip_creacion;
	private String ip_actualizacion;
	private Date fecha_creacion;
	private Date fecha_actualizacion;
	private Long personaId;
	
	public String getCodigo_alumno() {
		return codigo_alumno;
	}
	public void setCodigo_alumno(String codigo_alumno) {
		this.codigo_alumno = codigo_alumno;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getUsuario_creacion() {
		return usuario_creacion;
	}
	public void setUsuario_creacion(String usuario_creacion) {
		this.usuario_creacion = usuario_creacion;
	}
	public String getUsuario_actualizacion() {
		return usuario_actualizacion;
	}
	public void setUsuario_actualizacion(String usuario_actualizacion) {
		this.usuario_actualizacion = usuario_actualizacion;
	}
	public String getIp_creacion() {
		return ip_creacion;
	}
	public void setIp_creacion(String ip_creacion) {
		this.ip_creacion = ip_creacion;
	}
	public String getIp_actualizacion() {
		return ip_actualizacion;
	}
	public void setIp_actualizacion(String ip_actualizacion) {
		this.ip_actualizacion = ip_actualizacion;
	}
	public Date getFecha_creacion() {
		return fecha_creacion;
	}
	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}
	public Date getFecha_actualizacion() {
		return fecha_actualizacion;
	}
	public void setFecha_actualizacion(Date fecha_actualizacion) {
		this.fecha_actualizacion = fecha_actualizacion;
	}
	public Long getPersonaId() {
		return personaId;
	}
	public void setPersonaId(Long personaId) {
		this.personaId = personaId;
	}
}
