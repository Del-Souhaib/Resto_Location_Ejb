package ma.resto.config;

import java.util.List;

import javax.ejb.Local;

import ma.resto.models.Zone;

@Local
public interface ZoneLocal {
	void add(Zone vi);

	List<Zone> finddAll();

	Zone findById(int id);

	void deleteZone(int id);

	List<Zone> finddByVille(int ville_id);

}
