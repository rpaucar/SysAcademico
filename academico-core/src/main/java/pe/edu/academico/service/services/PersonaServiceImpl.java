package pe.edu.academico.service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.academico.core.dao.PersonaDAO;
import pe.edu.academico.core.domain.Persona;

@Service("personaService")
public class PersonaServiceImpl {

	@Autowired
	private PersonaDAO personaDAO;
	
	public List<Persona> findAllPersona(){
		return personaDAO.findAllPersona();
	}
}
