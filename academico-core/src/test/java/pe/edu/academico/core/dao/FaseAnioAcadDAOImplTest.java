package pe.edu.academico.core.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.academico.core.domain.FaseAnioAcad;

public class FaseAnioAcadDAOImplTest extends AbstractUnitTest{

	@Autowired
	protected FaseAnioAcadDAO faseAnioAcadDAO;
	
	public void testFindAllFaseAnioAcadd(){
		System.out.print("Lista :"+faseAnioAcadDAO.findAllFaseAnioAcad());
		List<FaseAnioAcad> list = faseAnioAcadDAO.findAllFaseAnioAcad();
		
		for (FaseAnioAcad faseAnioAcad: list){
			System.out.print(faseAnioAcad.getNombre());
		}
	}
}
