package pe.edu.academico.service.services;

import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.academico.core.dao.AnioAcademicoDAO;
import pe.edu.academico.core.domain.AnioAcademico;
import pe.edu.academico.core.domain.FaseAnioAcad;
import pe.edu.academico.core.form.AnioAcademicoForm;

@Service("anioAcademicoService")
public class AnioAcademicoServiceImpl {

	@Autowired
	private AnioAcademicoDAO anioAcademicoDAO;
	protected static SimpleDateFormat formDat = new SimpleDateFormat("yyyy-MM-dd");
	
	public List<AnioAcademico> findAllAnioAcademico(){
		return anioAcademicoDAO.findAllAnioAcademico();
	}
	public void saveAnioAcademico(AnioAcademicoForm anioAcademicoForm) {
		AnioAcademico anio=new AnioAcademico();
		anio=AnioAcademicoFormTOAnioAcademico(anioAcademicoForm);
		
		anioAcademicoDAO.saveObject(anio);
	}
	public void deleteAnioAcademicoById(String idAnioAcademico) {
		
		AnioAcademico anioAcademico=new AnioAcademico();
		anioAcademico=anioAcademicoDAO.findAnioAcademicoById(Long.parseLong(idAnioAcademico));
		//System.out.println("encontro al ano "+anioAcademico.getNombre());
		if(StringUtils.isNotEmpty(anioAcademico.getId().toString())){
			System.out.println("eliminimara por que si existe");
		anioAcademicoDAO.deleteAnioAcademico(anioAcademico);	
		}
	}
	public AnioAcademico findAnioAcademicoById(String IdAnioAcademico) {
		return anioAcademicoDAO.findAnioAcademicoById(Long.parseLong(IdAnioAcademico));
	}
	
	public void deleteAnioAcademico(AnioAcademico anioAcademico) {
		anioAcademicoDAO.deleteAnioAcademico(anioAcademico);
	}
	public AnioAcademicoForm AnioAcademicoTOAnioAcademicoForm(AnioAcademico anioAcademico) {
		
		AnioAcademicoForm anioForm=new AnioAcademicoForm();
		anioForm.setId(anioAcademico.getId().toString());
		anioForm.setEstado(anioAcademico.getEstado());
		anioForm.setNombre(anioAcademico.getNombre());
		anioForm.setAnio_escolar(anioAcademico.getAnio_escolar());
		anioForm.setIdFaseAnioAcad(anioAcademico.getFaseAnioAcad().getId().toString());
		anioForm.setFecha_inicio(anioAcademico.getFecha_inicio().toString());
		anioForm.setFecha_fin(anioAcademico.getFecha_fin().toString());
		anioForm.setFecha_cierre_nomina(anioAcademico.getFecha_cierre_nomina().toString());
		
		return anioForm;
	}
	public AnioAcademico AnioAcademicoFormTOAnioAcademico(AnioAcademicoForm anioAcademicoForm) {
		AnioAcademico anio=new AnioAcademico();
		FaseAnioAcad fa= new FaseAnioAcad();
		fa.setId(Long.parseLong(anioAcademicoForm.getIdFaseAnioAcad()));
		if(anioAcademicoForm.getId()!=null){
			anio.setId(Long.parseLong(anioAcademicoForm.getId()));
		}
		anio.setEstado(anioAcademicoForm.getEstado());
		anio.setNombre(anioAcademicoForm.getNombre());
		anio.setAnio_escolar(anioAcademicoForm.getAnio_escolar());
		anio.setFaseAnioAcad(fa);
		try {
		
			anio.setFecha_inicio(formDat.parse(anioAcademicoForm.getFecha_inicio()));
			anio.setFecha_fin(formDat.parse(anioAcademicoForm.getFecha_fin()));
			anio.setFecha_cierre_nomina(formDat.parse(anioAcademicoForm.getFecha_cierre_nomina()));
			
		} catch (Exception e) {
			System.out.println("error parse fechas "+e.getMessage());
			// TODO: handle exception
		}
		
		return anio;
	}
}
