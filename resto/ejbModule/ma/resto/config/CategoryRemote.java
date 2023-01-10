package ma.resto.config;

import java.util.List;

import javax.ejb.Remote;

import ma.resto.models.Category;

@Remote
public interface CategoryRemote {
	void add(Category ca);

	List<Category> finddAll();

	Category findById(int id);

	void deleteCategory(int id);

}
