package ma.resto.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Zone implements Serializable{

	@Id
	@SequenceGenerator(name = "zone_identifier", sequenceName = "zone_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "zone_identifier")
	private int id;

	private String name;
	

	@ManyToOne
    @JoinColumn(name="ville_id",insertable=false ,updatable=false)
	private Ville ville;
	
	private int ville_id;
	

	public Zone() {
		super();
	}

	public Zone(int id, String name,int ville_id) {
		super();
		this.id = id;
		this.name = name;
		this.ville_id = ville_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	public int getVille_id() {
		return ville_id;
	}

	public void setVille_id(int ville_id) {
		this.ville_id = ville_id;
	}
	

}
