package ma.resto.config;

import java.util.List;

import javax.ejb.Remote;

import ma.resto.models.Serie;

@Remote
public interface SerieRemote {
	void add(Serie vi);

	List<Serie> finddAll();

	Serie findById(int id);

	void deleteSerie(int id);

}
