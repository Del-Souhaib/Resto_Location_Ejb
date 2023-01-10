package ma.resto.config;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ma.resto.models.Category;

@Stateless(name = "Category")
public class CategoryEJBImp implements CategoryLocal, CategoryRemote {
	@PersistenceContext
	EntityManager em;

	@Override
	public void add(Category ca) {
		// TODO Auto-generated method stub
		em.persist(ca);
	}

	@Override
	public List<Category> finddAll() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("from Category");
		return query.getResultList();
	}

	@Override
	public Category findById(int id) {
		// TODO Auto-generated method stub
		Category cm = em.find(Category.class, id);
		if (cm == null)
			throw new RuntimeException("Category introvable");
		return cm;
	}

	@Override
	public void deleteCategory(int id) {
		// TODO Auto-generated method stub
		em.createQuery("delete from Category c where c.id=:id").setParameter("id", id).executeUpdate();

	}

}
