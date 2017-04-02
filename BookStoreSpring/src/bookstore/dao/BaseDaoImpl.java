package bookstore.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

public class BaseDaoImpl implements BaseDao{

	@PersistenceContext
	private EntityManager em;
	
	//Persist entities to the DB
	@Override
	public void persist(Object obj) {
		em.persist(obj);
	}

	@Override
	public <T> List<T> getAll(Class<T> clazz) {
		TypedQuery<T> query = em.createQuery(" from " + clazz.getName(), clazz);
		return query.getResultList();
	}

}
