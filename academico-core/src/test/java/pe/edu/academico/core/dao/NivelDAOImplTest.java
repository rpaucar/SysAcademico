package pe.edu.academico.core.dao;

import java.util.List;

import pe.edu.academico.core.domain.Nivel;

public class NivelDAOImplTest extends AbstractUnitTest{

protected NivelDAO nivelDAO;
	
	public void testFindAllNivel(){
		System.out.print("Lista :"+nivelDAO.findAllNivel());
		List<Nivel> list = nivelDAO.findAllNivel();
		
		for (Nivel nivel: list){
			System.out.print(nivel.getNombre());
		}
	}
}
