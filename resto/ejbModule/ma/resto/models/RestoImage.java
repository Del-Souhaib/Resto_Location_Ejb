package ma.resto.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class RestoImage implements Serializable{
	
	@Id
	@SequenceGenerator(name = "resto_image_identifier", sequenceName = "resto_image_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "resto_image_identifier")
	private int id;

	private String name;
	
	
	@ManyToOne
    @JoinColumn(name="resto_id",insertable=false ,updatable=false)
	private Resto resto;
	
	private int resto_id;
/*
    @ManyToMany(mappedBy = "categories", cascade = CascadeType.ALL)
	private List<Resto> restos;
*/
	
	public RestoImage() {
		super();
	}

	public RestoImage(String name,int resto_id) {
		this.name = name;
		this.resto_id=resto_id;
	}

	public RestoImage(int id, String name,Resto resto) {
		super();
		this.id = id;
		this.name = name;
	//	this.resto=resto;
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

	public Resto getResto() {
		return resto;
	}

	public void setResto(Resto resto) {
		this.resto = resto;
	}

	public int getResto_id() {
		return resto_id;
	}

	public void setResto_id(int resto_id) {
		this.resto_id = resto_id;
	}

}
