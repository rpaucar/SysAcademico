package pe.edu.academico.service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.academico.core.dao.AbstractUnitTest;
import pe.edu.academico.core.domain.Persona;

public class PersonaServiceImplTest extends AbstractUnitTest{

	@Autowired
	protected PersonaServiceImpl serviceImpl;
	
	public void testFindAllPersona(){
		
		System.out.println(serviceImpl.findAllPersona());
		
		List<Persona> list = serviceImpl.findAllPersona();
		for (Persona persona: list){
			System.out.print(persona.getNombres());
		}
	}
}
