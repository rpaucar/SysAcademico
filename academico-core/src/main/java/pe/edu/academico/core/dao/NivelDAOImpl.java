package pe.edu.academico.core.dao;

import java.util.List;

import pe.edu.academico.core.domain.Nivel;

public class NivelDAOImpl extends BaseDAOHibernate implements NivelDAO{

	public List<Nivel> findAllNivel(){
		return find(Nivel.class,"FROM Nivel");
	}
	
	public Nivel findNivelById(Long nivelId) {
		return this.findById(Nivel.class, nivelId);
	}
	
	public void saveNivel(Nivel nivel) {
		save(nivel);
	}
	
	public void deleteNivel(Nivel nivel) {
		delete(nivel);
	}
}
