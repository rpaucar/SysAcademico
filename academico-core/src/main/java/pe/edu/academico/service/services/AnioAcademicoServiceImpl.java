package pe.edu.academico.service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.academico.core.dao.AnioAcademicoDAO;
import pe.edu.academico.core.domain.AnioAcademico;

@Service("anioAcademicoService")
public class AnioAcademicoServiceImpl {

	@Autowired
	private AnioAcademicoDAO anioAcademicoDAO;
	
	public List<AnioAcademico> findAllAnioAcademico(){
		return anioAcademicoDAO.findAllAnioAcademico();
	}
	public void SaveAnioAcademico(AnioAcademico anioAcademico) {
		anioAcademicoDAO.saveObject(anioAcademico);
	}
}
