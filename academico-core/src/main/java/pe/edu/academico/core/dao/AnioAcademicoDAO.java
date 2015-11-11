package pe.edu.academico.core.dao;

import java.util.List;

import org.hibernate.Session;

import pe.edu.academico.core.domain.AnioAcademico;
import pe.edu.academico.core.domain.BaseEntity;

public interface AnioAcademicoDAO {

	List<AnioAcademico> findAllAnioAcademico();
	
	public <T> T findById(Class<T> entityClass, Long id);

	public void save(BaseEntity entity);

	public void saveObject(Object entity);

	public void saveObjectAll(List<?> entities);

	public <T> void delete(T entity);

	public void update(BaseEntity entity);
	
	public void saveAnioAcademico(AnioAcademico anioAcademico);
}
