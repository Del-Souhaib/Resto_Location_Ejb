package ma.resto.config;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ma.resto.models.Resto;

@Stateless(name = "Resto")
public class RestoEJBImp implements RestoLocal, RestoRemote {
	@PersistenceContext
	EntityManager em;

	@Override
	public void add(Resto vi) {
		// TODO Auto-generated method stub
		em.persist(vi);
	}

	@Override
	public List<Resto> finddAll() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("from Resto");
		return query.getResultList();
	}

	@Override
	public Resto findById(int id) {
		// TODO Auto-generated method stub
		Resto cm = em.find(Resto.class, id);
		if (cm == null)
			throw new RuntimeException("Resto introvable");
		return cm;
	}

	@Override
	public void deleteResto(int id) {
		// TODO Auto-generated method stub
		em.createQuery("delete from Resto c where c.id=:id").setParameter("id", id).executeUpdate();
	}

	@Override
	public List<Resto> recherche(int zone_id){
		Query query = em.createQuery("from Resto r where r.zone_id=:zone_id").setParameter("zone_id", zone_id);
		return query.getResultList();
	}

}
