package pe.edu.academico.core.dao;

import java.util.List;

import pe.edu.academico.core.domain.Personal;


public interface PersonalDAO {

	List<Personal> findAllPersonal();
	
	Personal findPersonalById(Long personalId);
	
	void savePersonal(Personal personal);
	
	void deletePersonal(Personal personal);
}
