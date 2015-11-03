package pe.edu.academico.core.dao;

import java.util.List;

import pe.edu.academico.core.domain.Alumno;

public class AlumnoDAOImpl extends BaseDAOHibernate implements AlumnoDAO{

	public List<Alumno> findAllAlumno(){
		return find(Alumno.class,"FROM Alumno");
	}
	
	public Alumno findAlumnoById(Long alumnoId) {
		return this.findById(Alumno.class, alumnoId);
	}
	
	public void saveAlumno(Alumno alumno) {
		save(alumno);
	}
	
	public void deleteAlumno(Alumno alumno) {
		delete(alumno);
	}
}
