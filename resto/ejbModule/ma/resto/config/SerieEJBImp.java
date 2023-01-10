package ma.resto.config;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ma.resto.models.Serie;

@Stateless(name = "Serie")
public class SerieEJBImp implements SerieLocal, SerieRemote {
	@PersistenceContext
	EntityManager em;

	@Override
	public void add(Serie vi) {
		// TODO Auto-generated method stub
		em.persist(vi);
	}

	@Override
	public List<Serie> finddAll() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("from Serie");
		return query.getResultList();
	}

	@Override
	public Serie findById(int id) {
		// TODO Auto-generated method stub
		Serie cm = em.find(Serie.class, id);
		if (cm == null)
			throw new RuntimeException("Serie introvable");
		return cm;
	}

	@Override
	public void deleteSerie(int id) {
		// TODO Auto-generated method stub
		em.createQuery("delete from Serie c where c.id=:id").setParameter("id", id).executeUpdate();
	}

}
