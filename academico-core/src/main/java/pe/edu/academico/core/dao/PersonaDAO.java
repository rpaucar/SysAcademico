package pe.edu.academico.core.dao;

import java.util.List;

import pe.edu.academico.core.domain.BaseEntity;
import pe.edu.academico.core.domain.Persona;

public interface PersonaDAO {

	List<Persona> findAllPersona();
	
	Persona findPersonaById(Long personaId);
	
	public void save(BaseEntity entity);
	
	void savePersona(Persona persona);
	
	void deletePersona(Persona persona);
}
