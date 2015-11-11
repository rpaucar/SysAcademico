package pe.edu.academico.core.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.academico.core.domain.Alumno;

public class AlumnoDAOImplTest extends AbstractUnitTest{

	@Autowired
	protected AlumnoDAO alumnoDAO;
	
	public void testFindAllAlumno(){
		System.out.print("Lista :"+alumnoDAO.findAllAlumno());
		List<Alumno> list = alumnoDAO.findAllAlumno();
		
		for (Alumno alumno: list){
			System.out.print(alumno.getCodigo_alumno());
		}
	}
}
