package ma.resto.config;

import java.util.List;

import javax.ejb.Local;

import ma.resto.models.Resto;

@Local
public interface RestoLocal {
	
	void add(Resto vi);

	List<Resto> finddAll();

	Resto findById(int id);

	void deleteResto(int id);
	
	List<Resto> recherche(int zone_id);


}
