package ma.resto.config;

import java.util.List;

import javax.ejb.Local;

import ma.resto.models.Serie;

@Local
public interface SerieLocal {
	void add(Serie vi);

	List<Serie> finddAll();

	Serie findById(int id);

	void deleteSerie(int id);

}
