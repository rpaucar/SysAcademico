package pe.edu.academico.core.dao;

import java.util.List;

import pe.edu.academico.core.domain.Alumno;
import pe.edu.academico.core.domain.BaseEntity;

public interface AlumnoDAO {
	
	List<Alumno> findAllAlumno();
	
	public <T> T findById(Class<T> entityClass, Long id);

	public void save(BaseEntity entity);

	public void saveObject(Object entity);

	public void saveObjectAll(List<?> entities);

	public <T> void delete(T entity);

	public void update(BaseEntity entity);
}
