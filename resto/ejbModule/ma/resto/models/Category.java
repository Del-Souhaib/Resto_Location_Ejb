package ma.resto.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity

public class Category implements Serializable{

	
	@Id
	@SequenceGenerator(name = "category_identifier", sequenceName = "category_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "category_identifier")
	private int id;

	private String name;
/*
    @ManyToMany(mappedBy = "categories", cascade = CascadeType.ALL)
	private List<Resto> restos;
*/
	
	public Category() {
		super();
	}

	public Category(String name) {
		this.name = name;
	}

	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
/*
	public List<Resto> getRestos() {
		return restos;
	}

	public void setRestos(List<Resto> restos) {
		this.restos = restos;
	}
	*/

	
}
