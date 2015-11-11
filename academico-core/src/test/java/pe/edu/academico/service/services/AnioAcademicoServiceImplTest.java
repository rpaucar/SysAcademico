package pe.edu.academico.service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.academico.core.dao.AbstractUnitTest;
import pe.edu.academico.core.domain.AnioAcademico;

public class AnioAcademicoServiceImplTest extends AbstractUnitTest{

	@Autowired
	protected AnioAcademicoServiceImpl serviceImpl;
	
	public void testFindAllAnioAcademico(){
		
		System.out.println(serviceImpl.findAllAnioAcademico());
		
		List<AnioAcademico> list = serviceImpl.findAllAnioAcademico();
		for (AnioAcademico anioAcademico: list){
			System.out.print(anioAcademico.getNombre());
		}
	}
}
