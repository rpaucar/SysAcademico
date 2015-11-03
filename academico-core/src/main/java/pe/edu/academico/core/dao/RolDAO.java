package pe.edu.academico.core.dao;

import java.util.List;

import pe.edu.academico.core.domain.Rol;

public interface RolDAO {

	List<Rol> findAllRol();
	
	Rol findRolById(Long rolId);
	
	void saveRol(Rol rol);
	
	void deleteRol(Rol rol);
}
