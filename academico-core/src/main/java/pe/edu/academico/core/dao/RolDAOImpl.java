package pe.edu.academico.core.dao;

import java.util.List;

import pe.edu.academico.core.domain.Rol;
import pe.edu.academico.core.domain.Seccion;

public class RolDAOImpl extends BaseDAOHibernate implements RolDAO{

	public List<Rol> findAllRol(){
		return find(Rol.class,"FROM Rol");
	}
	
	public Rol findRolById(Long RolId) {
		return this.findById(Rol.class, RolId);
	}
	
	public void saveRol(Rol rol) {
		save(rol);
	}
	
	public void deleteRol(Rol rol) {
		delete(rol);
	}
}
