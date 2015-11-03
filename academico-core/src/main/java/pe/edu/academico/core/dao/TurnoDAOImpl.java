package pe.edu.academico.core.dao;

import java.util.List;

import pe.edu.academico.core.domain.Turno;

public class TurnoDAOImpl extends BaseDAOHibernate implements TurnoDAO{

	public List<Turno> findAllTurno(){
		return find(Turno.class,"FROM Turno");
	}
	
	public Turno findTurnoById(Long alumnoId) {
		return this.findById(Turno.class, alumnoId);
	}
	
	public void saveTurno(Turno turno) {
		save(turno);
	}
	
	public void deleteTurno(Turno turno) {
		delete(turno);
	}
}
