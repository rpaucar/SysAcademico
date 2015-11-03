package pe.edu.academico.core.dao;

import java.util.List;

import pe.edu.academico.core.domain.Alumno;
import pe.edu.academico.core.domain.Nivel;

public interface NivelDAO {

	List<Nivel> findAllNivel();
	
	Nivel findNivelById(Long nivelId);
	
	void saveNivel(Nivel nivel);
	
	void deleteNivel(Nivel nivel);
}
