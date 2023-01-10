package ma.resto.config;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ma.resto.models.Ville;

@Stateless(name = "Ville")
public class VilleEJBImp implements VilleLocal, VilleRemote {
	@PersistenceContext
	EntityManager em;

	@Override
	public void add(Ville vi) {
		// TODO Auto-generated method stub
		em.persist(vi);
	}

	@Override
	public List<Ville> finddAll() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("from Ville");
		return query.getResultList();
	}

	@Override
	public Ville findById(int id) {
		// TODO Auto-generated method stub
		Ville cm = em.find(Ville.class, id);
		if (cm == null)
			throw new RuntimeException("Ville introvable");
		return cm;
	}

	@Override
	public void deleteVille(int id) {
		// TODO Auto-generated method stub
		em.createQuery("delete from Ville v where v.id=:id").setParameter("id", id).executeUpdate();

	}

	@Override
	public List<Ville> findByZoneId(int id) {
		// TODO Auto-generated method stub
		Query query = em.createQuery("from Ville v inner join Zone z where z.id= :id").setParameter("id", id);
		return query.getResultList();
	}

	@Override
	public List<Ville> findByCategoryId(int id) {
		// TODO Auto-generated method stub
		Query query = em.createQuery("from Ville v inner join Category c where c.id= :id").setParameter("id", id);
		return query.getResultList();
	}

}
