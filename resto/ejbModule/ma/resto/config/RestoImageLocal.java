package ma.resto.config;

import java.util.List;

import javax.ejb.Local;

import ma.resto.models.Category;
import ma.resto.models.RestoImage;

@Local
public interface RestoImageLocal {
	void add(RestoImage ca);

	List<RestoImage> finddAll();

	RestoImage findById(int id);

	void deleteCategory(int id);

	List<RestoImage> finbyrestoId(int id);

}
