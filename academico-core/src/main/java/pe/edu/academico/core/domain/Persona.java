package pe.edu.academico.core.domain;

import java.io.Serializable;
import java.util.Date;

public class Persona extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 0L;
	
	private String nombres;
	private String ap_paterno;
	private String ap_materno;
	private String dni;
	private Date fecha_nac;
	private String sexo;
	private String estado;
	private String tipo_nacionalidad;
	private String nacionalidad;
	private String celular;
	private String direccion;
	private String ip_creacion;
	private String ip_actualizacion;
	private String usuario_creacion;
	private String usuario_actualizacion;
	private Date fecha_creacion;
	private Date fecha_actualizacion;
	private String email;
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getAp_paterno() {
		return ap_paterno;
	}
	public void setAp_paterno(String ap_paterno) {
		this.ap_paterno = ap_paterno;
	}
	public String getAp_materno() {
		return ap_materno;
	}
	public void setAp_materno(String ap_materno) {
		this.ap_materno = ap_materno;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Date getFecha_nac() {
		return fecha_nac;
	}
	public void setFecha_nac(Date fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTipo_nacionalidad() {
		return tipo_nacionalidad;
	}
	public void setTipo_nacionalidad(String tipo_nacionalidad) {
		this.tipo_nacionalidad = tipo_nacionalidad;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
