package pe.edu.academico.service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.academico.core.dao.FaseAnioAcadDAO;
import pe.edu.academico.core.domain.FaseAnioAcad;

@Service("faseAnioAcadService")
public class FaseAnioAcadServiceImpl {

	@Autowired
	private FaseAnioAcadDAO faseAnioAcadDAO;
	
	public List<FaseAnioAcad> findAllFaseAnioAcad(){
		return faseAnioAcadDAO.findAllFaseAnioAcad();
	}
}
