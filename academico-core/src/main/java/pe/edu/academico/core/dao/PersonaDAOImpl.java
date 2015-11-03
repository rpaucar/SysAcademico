package pe.edu.academico.core.dao;

import java.util.List;

import pe.edu.academico.core.domain.Alumno;
import pe.edu.academico.core.domain.Persona;

public class PersonaDAOImpl extends BaseDAOHibernate implements PersonaDAO{

	public List<Persona> findAllPersona(){
		return find(Persona.class,"FROM Persona");
	}
	
	public Persona findPersonaById(Long personaId) {
		return this.findById(Persona.class, personaId);
	}
	
	public void savePersona(Persona persona) {
		save(persona);
	}
	
	public void deletePersona(Persona persona) {
		delete(persona);
	}
}
