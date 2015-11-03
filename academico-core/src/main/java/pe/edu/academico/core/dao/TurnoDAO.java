package pe.edu.academico.core.dao;

import java.util.List;

import pe.edu.academico.core.domain.Turno;

public interface TurnoDAO {

	List<Turno> findAllTurno();
	
	Turno findTurnoById(Long turnoId);
	
	void saveTurno(Turno turno);
	
	void deleteTurno(Turno turno);
}
