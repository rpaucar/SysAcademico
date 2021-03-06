package pe.edu.academico.core.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.academico.core.domain.Especialidad;

public class EspecialidadDAOImplTest extends AbstractUnitTest{

	@Autowired
    protected EspecialidadDAO especialidadDAO;
	
	public void testFindAllEspecialidad(){
		System.out.print("Lista :"+especialidadDAO.findAllEspecialidad());
		List<Especialidad> list = especialidadDAO.findAllEspecialidad();
		
		for (Especialidad especialidad: list){
			System.out.print(especialidad.getNombre());
		}
	}
}
