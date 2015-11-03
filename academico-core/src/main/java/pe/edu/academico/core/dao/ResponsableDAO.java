package pe.edu.academico.core.dao;

import java.util.List;

import pe.edu.academico.core.domain.Responsable;

public interface ResponsableDAO {

	List<Responsable> findAllResponsable();
	
	Responsable findResponsableById(Long responsableId);
	
	void saveResponsable(Responsable responsable);
	
	void deleteResponsable(Responsable responsable);
}
