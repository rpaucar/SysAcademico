package pe.edu.academico.core.dao;

import java.util.List;

import pe.edu.academico.core.domain.Personal;

public class PersonalDAOImpl extends BaseDAOHibernate implements PersonalDAO {

	public List<Personal> findAllPersonal(){
		return find(Personal.class,"FROM Personal");
	}
	
	public Personal findPersonalById(Long personalId) {
		return this.findById(Personal.class, personalId);
	}
	
	public void savePersonal(Personal personal) {
		save(personal);
	}
	
	public void deletePersonal(Personal personal) {
		delete(personal);
	}
}
