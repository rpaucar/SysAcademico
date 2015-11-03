package pe.edu.academico.core.dao;

import java.util.List;

import pe.edu.academico.core.domain.Personal;

public class PersonalDAOImplTest extends AbstractUnitTest{

protected PersonalDAO personalDAO;
	
	public void testFindAllPersonal(){
		System.out.print("Lista :"+personalDAO.findAllPersonal());
		List<Personal> list = personalDAO.findAllPersonal();
		
		for (Personal personal: list){
			System.out.print(personal.getEstado());
		}
	}
}
