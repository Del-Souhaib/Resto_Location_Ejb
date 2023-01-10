package ma.resto.config;

import java.util.List;

import javax.ejb.Remote;

import ma.resto.models.Ville;

@Remote
public interface VilleRemote {
	void add(Ville vi);

	List<Ville> finddAll();

	Ville findById(int id);

	void deleteVille(int id);

	List<Ville> findByZoneId(int id);

	List<Ville> findByCategoryId(int id);

}
