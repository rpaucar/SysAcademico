package pe.edu.academico.core.dao;

import java.util.List;

import pe.edu.academico.core.domain.Persona;

public interface PersonaDAO {

	List<Persona> findAllPersona();
	
	Persona findPersonaById(Long personaId);
	
	void savePersona(Persona persona);
	
	void deletePersona(Persona persona);
}
