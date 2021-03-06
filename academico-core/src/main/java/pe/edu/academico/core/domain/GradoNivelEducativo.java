package pe.edu.academico.core.domain;

import java.io.Serializable;

public class GradoNivelEducativo extends BaseEntity implements Serializable {

private static final long serialVersionUID = 0L;

private Nivel nivel;
private String nombre;
private String estado;
private String descripcion;

public Nivel getNivel() {
	return nivel;
}
public void setNivel(Nivel nivel) {
	this.nivel = nivel;
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
public static long getSerialversionuid() {
	return serialVersionUID;
}


}
