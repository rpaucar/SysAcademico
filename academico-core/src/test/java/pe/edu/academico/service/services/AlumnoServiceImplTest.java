package pe.edu.academico.service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.academico.core.dao.AbstractUnitTest;
import pe.edu.academico.core.domain.Alumno;

public class AlumnoServiceImplTest extends AbstractUnitTest{

	@Autowired
	protected AlumnoServiceImpl serviceImpl;
	
	public void testFindAllAlumno(){
		
		System.out.println(serviceImpl.findAllAlumno());
		
		List<Alumno> list = serviceImpl.findAllAlumno();
		for (Alumno alumno: list){
			System.out.print(alumno.getCodigo_alumno());
		}
	}
}
