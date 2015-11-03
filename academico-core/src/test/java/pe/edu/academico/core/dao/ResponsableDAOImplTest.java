package pe.edu.academico.core.dao;

import java.util.List;

import pe.edu.academico.core.domain.Responsable;

public class ResponsableDAOImplTest extends AbstractUnitTest {
	
	protected ResponsableDAO responsableDAO;
	
	public void testFindAllResponsable(){
		System.out.print("Lista :"+responsableDAO.findAllResponsable());
		List<Responsable> list = responsableDAO.findAllResponsable();
		
		for (Responsable responsable: list){
			System.out.print(responsable.getEstado());
		}
	}
}
