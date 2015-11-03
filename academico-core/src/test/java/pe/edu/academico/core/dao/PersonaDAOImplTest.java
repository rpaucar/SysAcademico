package pe.edu.academico.core.dao;

import java.util.List;

import pe.edu.academico.core.domain.Persona;

public class PersonaDAOImplTest extends AbstractUnitTest{

	protected PersonaDAO personaDAO;
	
	public void testFindAllPersona(){
		System.out.print("Lista :"+personaDAO.findAllPersona());
		List<Persona> list = personaDAO.findAllPersona();
		
		for (Persona persona: list){
			System.out.print(persona.getNombres());
		}
	}
}
