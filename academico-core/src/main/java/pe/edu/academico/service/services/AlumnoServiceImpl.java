package pe.edu.academico.service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.academico.core.dao.AlumnoDAO;
import pe.edu.academico.core.domain.Alumno;

@Service("alumnoService")
public class AlumnoServiceImpl {

	@Autowired
	private AlumnoDAO alumnoDAO;
	
	public List<Alumno> findAllAlumno(){
		return alumnoDAO.findAllAlumno();
	}
}
