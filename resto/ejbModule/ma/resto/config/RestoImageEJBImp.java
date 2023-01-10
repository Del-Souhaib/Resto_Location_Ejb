package ma.resto.config;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ma.resto.models.Category;
import ma.resto.models.RestoImage;

@Stateless(name = "RestoImage")
public class RestoImageEJBImp implements RestoImageLocal, RestoImageRemote {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public void add(RestoImage ca) {
		// TODO Auto-generated method stub
		em.persist(ca);
	}

	@Override
	public List<RestoImage> finddAll() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("from RestoImage");
		return query.getResultList();
	}

	@Override
	public RestoImage findById(int id) {
		// TODO Auto-generated method stub
		RestoImage cm = em.find(RestoImage.class, id);
		if (cm == null)
			throw new RuntimeException("RestoImage introvable");
		return cm;
	}

	@Override
	public void deleteCategory(int id) {
		// TODO Auto-generated method stub
		em.createQuery("delete from RestoImage c where c.id=:id").setParameter("id", id).executeUpdate();

	}

	@Override
	public List<RestoImage> finbyrestoId(int id) {
		// TODO Auto-generated method stub
		Query query = em.createQuery("from RestoImage ri where ri.resto_id=:resto_id").setParameter("resto_id", id);
		return query.getResultList();
	}


}
