package pe.edu.academico.core.dao;

import java.util.List;
import pe.edu.academico.core.domain.Responsable;

public class ResponsableDAOImpl extends BaseDAOHibernate implements ResponsableDAO{

	public List<Responsable> findAllResponsable(){
		return find(Responsable.class,"FROM Responsable");
	}
	
	public Responsable findResponsableById(Long ResponsableId) {
		return this.findById(Responsable.class, ResponsableId);
	}
	
	public void saveResponsable(Responsable responsable) {
		save(responsable);
	}
	
	public void deleteResponsable(Responsable responsable) {
		delete(responsable);
	}
}
