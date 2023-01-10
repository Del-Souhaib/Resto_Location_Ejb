package ma.resto.config;

import java.util.List;

import javax.ejb.Local;

import ma.resto.models.Category;

@Local
public interface CategoryLocal {
	void add(Category ca);

	List<Category> finddAll();

	Category findById(int id);

	void deleteCategory(int id);

}
