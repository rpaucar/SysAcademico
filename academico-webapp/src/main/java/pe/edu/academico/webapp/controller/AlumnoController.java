package pe.edu.academico.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.edu.academico.service.services.AlumnoServiceImpl;

@Controller
public class AlumnoController {

	
	protected Log logger = LogFactory.getLog(getClass());

	@Autowired
	private AlumnoServiceImpl alumnoService;
	
	@RequestMapping(value = "alumno/dashboard", method = RequestMethod.GET)
	public String dashboard(Model model, HttpServletRequest request) {
		logger.info("::::::::::::alumno/dashboard:::::::::::::::"+alumnoService);
		model.addAttribute("listAlumno",alumnoService.findAllAlumno());
		request.getSession().setAttribute("menuHeader", "alumno");
		return "alumno/dashboard";
	}
	@RequestMapping(value = "alumno/alumnoForm", method = RequestMethod.POST)
	public String alumnoForm(Model model, HttpServletRequest request) {
	    
		//model.addAttribute("listAlumno",alumnoService.findAllAlumno());
		request.getSession().setAttribute("menuHeader", "alumno");
		return "alumno/alumnoForm";
	}
}
