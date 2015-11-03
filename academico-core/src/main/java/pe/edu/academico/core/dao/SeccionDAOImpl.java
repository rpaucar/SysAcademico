package pe.edu.academico.core.dao;

import java.util.List;

import pe.edu.academico.core.domain.Seccion;

public class SeccionDAOImpl extends BaseDAOHibernate implements SeccionDAO{

	public List<Seccion> findAllSeccion(){
		return find(Seccion.class,"FROM Seccion");
	}
	
	public Seccion findSeccionById(Long SeccionId) {
		return this.findById(Seccion.class, SeccionId);
	}
	
	public void saveSeccion(Seccion seccion) {
		save(seccion);
	}
	
	public void deleteSeccion(Seccion seccion) {
		delete(seccion);
	}
}
