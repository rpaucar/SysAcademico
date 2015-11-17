package pe.edu.academico.core.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.academico.core.domain.AnioAcademico;
import pe.edu.academico.core.domain.FaseAnioAcad;

public class AnioAcademicoDAOImplTest extends AbstractUnitTest{

	
	@Autowired
	protected AnioAcademicoDAO anioAcademicoDAO;
	@Autowired
	protected FaseAnioAcadDAO faseAnioAcadDAO;
	
	protected static SimpleDateFormat formDat = new SimpleDateFormat("dd/MM/yyyy");
	
//	public void testFindAllAnioAcademico(){
//		System.out.println("Lista :"+anioAcademicoDAO.findAllAnioAcademico());
//		List<AnioAcademico> list = anioAcademicoDAO.findAllAnioAcademico();
//		
//		for (AnioAcademico anioAcademico: list){
//			System.out.println("x "+anioAcademico.getNombre());
//			System.out.println("yyy "+anioAcademico.getFaseAnioAcad().getNombre());
//		}
//	}
	
//	public void testSaveAnioAcademico(){
//		
//		AnioAcademico anio=new AnioAcademico();
//		FaseAnioAcad fase=new FaseAnioAcad();
//		fase.setId(2L);
//		//aa.setId(1);
//		//anio.setId(2L);
//		anio.setNombre("2015-4");
//		anio.setFaseAnioAcad(fase);
//		anio.setAnio_escolar("2015");
//		anio.setEstado("1");
//		try {
//			anio.setFecha_inicio(new Date());
//			anio.setFecha_fin(new Date());
//			anio.setFecha_cierre_nomina(new Date());
//		} catch (Exception e) {
//			System.out.println("problemas con la fecha "+e.getMessage());
//		}
//		anioAcademicoDAO.saveAnioAcademico(anio);
//		System.out.println("debio guardar ");
//		setComplete();
//	}
//	
}
