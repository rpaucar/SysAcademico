package pe.edu.academico.service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.academico.core.dao.NivelDAO;
import pe.edu.academico.core.domain.Nivel;

@Service("nivelService")
public class NivelServiceImpl {

	@Autowired
	private NivelDAO nivelDAO;

	public List<Nivel> findAllNivel(){
		return nivelDAO.findAllNivel();
	}
}

