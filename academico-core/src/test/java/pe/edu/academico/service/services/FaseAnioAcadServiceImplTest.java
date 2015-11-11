package pe.edu.academico.service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.academico.core.dao.AbstractUnitTest;
import pe.edu.academico.core.domain.FaseAnioAcad;

public class FaseAnioAcadServiceImplTest extends AbstractUnitTest{

	@Autowired
	protected FaseAnioAcadServiceImpl serviceImpl;
	
	public void testFindAllFaseAnioAcad(){
		
		System.out.println(serviceImpl.findAllFaseAnioAcad());
		
		List<FaseAnioAcad> list = serviceImpl.findAllFaseAnioAcad();
		for (FaseAnioAcad faseAnioAcad: list){
			System.out.print(faseAnioAcad.getNombre());
		}
	}
}
