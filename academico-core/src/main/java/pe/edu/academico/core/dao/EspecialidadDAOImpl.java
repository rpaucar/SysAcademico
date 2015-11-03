package pe.edu.academico.core.dao;

import java.util.List;

import pe.edu.academico.core.domain.Especialidad;

public class EspecialidadDAOImpl extends BaseDAOHibernate implements EspecialidadDAO{

	public List<Especialidad> findAllEspecialidad(){
		return find(Especialidad.class,"FROM Especialidad");
	}
	
	public Especialidad findEspecialidadById(Long especialidadId) {
		return this.findById(Especialidad.class, especialidadId);
	}
	
	public void saveEspecialidad(Especialidad especialidad) {
		save(especialidad);
	}
	
	public void deleteEspecialidad(Especialidad especialidad) {
		delete(especialidad);
	}
}
