package pe.edu.academico.core.dao;

import java.util.List;

import pe.edu.academico.core.domain.BaseEntity;
import pe.edu.academico.core.domain.FaseAnioAcad;

public interface FaseAnioAcadDAO {

	List<FaseAnioAcad> findAllFaseAnioAcad();
	
	public <T> T findById(Class<T> entityClass, Long id);

	public void save(BaseEntity entity);

	public void saveObject(Object entity);

	public void saveObjectAll(List<?> entities);

	public <T> void delete(T entity);

	public void update(BaseEntity entity);
}
