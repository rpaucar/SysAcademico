package pe.edu.academico.core.dao;

import java.util.List;

import pe.edu.academico.core.domain.AnioAcademico;

public class AnioAcademicoDAOImpl extends BaseDAOHibernate implements AnioAcademicoDAO{

	public List<AnioAcademico> findAllAnioAcademico(){
		return find(AnioAcademico.class,"FROM AnioAcademico");
	}
	
	public AnioAcademico findAnioAcademicoById(Long anioAcademicoId) {
		return this.findById(AnioAcademico.class, anioAcademicoId);
	}
	
	public void saveAnioAcademico(AnioAcademico anioAcademico) {
		System.out.println("llega a cmetodo guardar en anioacademicodaoimpl "+anioAcademico.getNombre());
		saveObject(anioAcademico);
	}
	
	public void deleteAnioAcademico(AnioAcademico anioAcademico) {
		delete(anioAcademico);
	}
}
