package pe.edu.academico.service.services;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.academico.core.dao.AbstractUnitTest;
import pe.edu.academico.core.domain.AnioAcademico;
import pe.edu.academico.core.domain.FaseAnioAcad;
import pe.edu.academico.core.form.AnioAcademicoForm;

public class AnioAcademicoServiceImplTest extends AbstractUnitTest{

	@Autowired
	protected AnioAcademicoServiceImpl serviceImpl;
//	public void testFindAllAnioAcademico(){
//		
//		System.out.println(serviceImpl.findAllAnioAcademico());
//		
//		List<AnioAcademico> list = serviceImpl.findAllAnioAcademico();
//		for (AnioAcademico anioAcademico: list){
//			System.out.print(anioAcademico.getNombre());
//		}
//	}
	
	
//	public void testSaveAnioAcademico(){
//		
//		AnioAcademicoForm aniof=new AnioAcademicoForm();
//		FaseAnioAcad fase=new FaseAnioAcad();
//		fase.setId(2L);
//		//aa.setId(1);
//		//anio.setId(2L);
//		aniof.setNombre("2015-3 testF");
//		aniof.setIdFaseAnioAcad("1");
//		aniof.setAnio_escolar("2015");
//		aniof.setEstado("1");
//		aniof.setFecha_inicio("10-11-2012");
//		aniof.setFecha_fin("20-11-2013");
//		aniof.setFecha_cierre_nomina("01-12-2014");
//
//		serviceImpl.SaveAnioAcademico(aniof);
//		System.out.println("debio guardar ");
//		setComplete();
//	}
	
//	public void testDeleteAnioAcademico() {
//		System.out.println("este en mi metodo ");
//	    
//		String idAnioAcademico="2";
//		serviceImpl.deleteAnioAcademicoById(idAnioAcademico);
//		setComplete();
//		System.out.println("debio eliminar ");
//		
//	}
	public void testFindAnioAcademicoById(){
	
	
	AnioAcademico anioAcademico = serviceImpl.findAnioAcademicoById("12");
	
	System.out.print(anioAcademico.getNombre());
	
}
	
}
