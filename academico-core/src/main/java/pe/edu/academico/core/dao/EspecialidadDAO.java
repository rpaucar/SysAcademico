package pe.edu.academico.core.dao;

import java.util.List;

import pe.edu.academico.core.domain.Especialidad;

public interface EspecialidadDAO {

	List<Especialidad> findAllEspecialidad();
	
	Especialidad findEspecialidadById(Long especialidadId);
	
	void saveEspecialidad(Especialidad especialidad);
	
	void deleteEspecialidad(Especialidad especialidad);

}
