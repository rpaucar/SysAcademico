package pe.edu.academico.core.dao;

import java.util.List;
import pe.edu.academico.core.domain.FaseAnioAcad;

public class FaseAnioAcadDAOImpl extends BaseDAOHibernate implements FaseAnioAcadDAO{

	public List<FaseAnioAcad> findAllFaseAnioAcad(){
		return find(FaseAnioAcad.class,"FROM FaseAnioAcad");
	}
	
	public FaseAnioAcad findFaseAnioAcadById(Long faseAnioAcadId) {
		return this.findById(FaseAnioAcad.class, faseAnioAcadId);
	}
	
	public void saveFaseAnioAcad(FaseAnioAcad faseAnioAcad) {
		save(faseAnioAcad);
	}
	
	public void deleteFaseAnioAcad(FaseAnioAcad faseAnioAcad) {
		delete(faseAnioAcad);
	}
}
