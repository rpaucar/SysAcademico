package pe.edu.academico.core.dao;

import java.util.List;

import pe.edu.academico.core.domain.Turno;

public class TurnoDAOImplTest extends AbstractUnitTest{

	protected TurnoDAO turnoDAO;
	
	public void testFindAllTurno(){
		System.out.print("Lista :"+turnoDAO.findAllTurno());
		List<Turno> list = turnoDAO.findAllTurno();
		
		for (Turno turno: list){
			System.out.print(turno.getNombre());
		}
	}
}
