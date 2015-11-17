package pe.edu.academico.service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.academico.core.dao.AbstractUnitTest;
import pe.edu.academico.core.domain.Nivel;

public class NivelServiceImplTest extends AbstractUnitTest{
    
	@Autowired
	protected NivelServiceImpl nivelService;
	
	public void testFindAllNivel() {
		
		System.out.println(nivelService.findAllNivel());
		
		List<Nivel> list = nivelService.findAllNivel();
		for (Nivel nivel: list){
			System.out.println(nivel.getNombre());
		}
	}
}
