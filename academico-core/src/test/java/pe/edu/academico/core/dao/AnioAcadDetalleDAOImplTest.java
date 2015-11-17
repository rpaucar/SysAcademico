package pe.edu.academico.core.dao;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.academico.core.domain.AnioAcadDetalle;

public class AnioAcadDetalleDAOImplTest extends AbstractUnitTest{

	
	@Autowired
	protected AnioAcadDetalleDAO anioAcadDetalleDAO;
	
//	public void testFindAllAnioAcadDetalle(){
//		System.out.println("Lista :"+anioAcadDetalleDAO.findAllAnioAcadDetalle());
//		List<AnioAcadDetalle> list = anioAcadDetalleDAO.findAllAnioAcadDetalle();
//		
//		for (AnioAcadDetalle anioAcadDetalle: list){
//			System.out.println("x "+anioAcadDetalle.getAnioAcademico().getNombre());
//			System.out.println("yyy "+anioAcadDetalle.getNivel().getNombre());
//		}
//	}
	public void testFindAllAnioAcadDetalleByIdAnioAcademico(){
		System.out.println("Lista :"+anioAcadDetalleDAO.findAllAnioAcadDetalleByIdAnioAcademico("12"));
		List<AnioAcadDetalle> list = anioAcadDetalleDAO.findAllAnioAcadDetalleByIdAnioAcademico("12");
		
		for (AnioAcadDetalle anioAcadDetalle: list){
			System.out.println("x "+anioAcadDetalle.getAnioAcademico().getNombre());
			System.out.println("yyy "+anioAcadDetalle.getNivel().getNombre());
		}
	}
}
