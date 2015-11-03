package pe.edu.academico.core.dao;

import java.util.List;

import pe.edu.academico.core.domain.Seccion;

public interface SeccionDAO {

	List<Seccion> findAllSeccion();
	
	Seccion findSeccionById(Long seccionId);
	
	void saveSeccion(Seccion seccion);
	
	void deleteSeccion(Seccion seccion);
}
