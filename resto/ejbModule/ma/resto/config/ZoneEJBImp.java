package ma.resto.config;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ma.resto.models.Zone;

@Stateless(name = "Zone")
public class ZoneEJBImp implements ZoneLocal, ZoneRemote {
	@PersistenceContext
	EntityManager em;

	@Override
	public void add(Zone vi) {
		// TODO Auto-generated method stub
		em.persist(vi);
	}

	@Override
	public List<Zone> finddAll() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("from Zone");
		return query.getResultList();
	}

	@Override
	public Zone findById(int id) {
		// TODO Auto-generated method stub
		Zone cm = em.find(Zone.class, id);
		if (cm == null)
			throw new RuntimeException("Zone introvable");
		return cm;
	}

	@Override
	public void deleteZone(int id) {
		// TODO Auto-generated method stub
		em.createQuery("delete from Zone c where c.id=:id").setParameter("id", id).executeUpdate();

	}

	public List<Zone> finddByVille(int ville_id){
		Query query = em.createQuery("from Zone z where z.ville_id= :ville_id").setParameter("ville_id", ville_id);
		return query.getResultList();

	}

}
