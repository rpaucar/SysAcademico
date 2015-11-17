package pe.edu.academico.service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.academico.core.dao.AnioAcadDetalleDAO;
import pe.edu.academico.core.domain.AnioAcadDetalle;

@Service("anioAcadDetalleService")
public class AnioAcadDetalleServiceImpl {

	@Autowired
	private AnioAcadDetalleDAO anioAcadDetalleDAO;
	//protected static SimpleDateFormat formDat = new SimpleDateFormat("yyyy-MM-dd");
	
	public List<AnioAcadDetalle> findAllAnioAcadDetalle(){
		return anioAcadDetalleDAO.findAllAnioAcadDetalle();
	}
	public List<AnioAcadDetalle> findAllAnioAcadDetalleByIdAnioAcademico(String idAnioAcademico){
		return anioAcadDetalleDAO.findAllAnioAcadDetalleByIdAnioAcademico(idAnioAcademico);
	}
}
