package ma.resto.config;

import java.util.List;

import javax.ejb.Remote;

import ma.resto.models.Zone;

@Remote
public interface ZoneRemote {
	void add(Zone vi);

	List<Zone> finddAll();

	Zone findById(int id);

	void deleteZone(int id);

	List<Zone> finddByVille(int ville_id);

}
