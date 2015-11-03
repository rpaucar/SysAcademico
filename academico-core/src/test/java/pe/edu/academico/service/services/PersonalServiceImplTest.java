package pe.edu.academico.service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.academico.core.dao.AbstractUnitTest;
import pe.edu.academico.core.domain.Personal;

public class PersonalServiceImplTest extends AbstractUnitTest{

	@Autowired
	protected PersonalServiceImpl serviceImpl;
	
	public void testFindAllPersonal(){
		
		System.out.println(serviceImpl.findAllPersonal());
		
		List<Personal> list = serviceImpl.findAllPersonal();
		for (Personal personal: list){
			System.out.print(personal.getEstado());
		}
	}
}
