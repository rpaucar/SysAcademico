package pe.edu.academico.core.dao;

import java.util.List;

import pe.edu.academico.core.domain.AnioAcadDetalle;

public class AnioAcadDetalleDAOImpl extends BaseDAOHibernate implements AnioAcadDetalleDAO {

	public List<AnioAcadDetalle> findAllAnioAcadDetalle(){
		return find(AnioAcadDetalle.class,"FROM AnioAcadDetalle");
	}
	public List<AnioAcadDetalle> findAllAnioAcadDetalleByIdAnioAcademico(String idAnioAcademico){
		return find(AnioAcadDetalle.class,"FROM AnioAcadDetalle where anioAcadId="+idAnioAcademico);
	}
	
	public AnioAcadDetalle findAnioAcadDetalleById(Long anioAcadDetalleId) {
		return this.findById(AnioAcadDetalle.class, anioAcadDetalleId);
	}
	
	public void saveAnioAcadDetalle(AnioAcadDetalle anioAcadDetalle) {
		save(anioAcadDetalle);
	}
	
	public void deleteAlumno(AnioAcadDetalle anioAcadDetalle) {
		delete(anioAcadDetalle);
	}
}
