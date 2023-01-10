package ma.resto.config;

import java.util.List;

import javax.ejb.Remote;

import ma.resto.models.Resto;

@Remote
public interface RestoRemote {
	void add(Resto vi);

	List<Resto> finddAll();

	Resto findById(int id);

	void deleteResto(int id);

	List<Resto> recherche(int zone_id);

}
