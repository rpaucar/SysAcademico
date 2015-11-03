package pe.edu.academico.service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.academico.core.dao.PersonalDAO;
import pe.edu.academico.core.domain.Personal;

@Service("personalService")
public class PersonalServiceImpl {

	@Autowired
	private PersonalDAO personalDAO;
	
	public List<Personal> findAllPersonal(){
		return personalDAO.findAllPersonal();
	}
}
