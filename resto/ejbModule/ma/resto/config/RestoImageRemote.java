package ma.resto.config;

import java.util.List;

import javax.ejb.Remote;

import ma.resto.models.Category;
import ma.resto.models.RestoImage;

@Remote
public interface RestoImageRemote {
	void add(RestoImage ca);

	List<RestoImage> finddAll();

	RestoImage findById(int id);

	void deleteCategory(int id);
	
	List<RestoImage> finbyrestoId(int id);

}
