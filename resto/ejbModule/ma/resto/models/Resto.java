package ma.resto.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Resto implements Serializable{

	@Id
	@SequenceGenerator(name = "resto_identifier", sequenceName = "resto_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "resto_identifier")
	private int id;

	private String name;

	private String description;
	private String adresse;
	private double long0;
	private double lat;
	private double rank;
	private Date openTime;
	private Date closeTime;
	private boolean openWeekEnd;

	private String coverImage;

	@ManyToOne
    @JoinColumn(name="zone_id",insertable=false ,updatable=false)
	private Zone zone;

	/*
	@ManyToMany
	@JoinTable(name="resto_category",
			joinColumns = @JoinColumn(name = "Resto_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
			)
	private List<Category> categories;
*/
	@ManyToOne
    @JoinColumn(name="category_id",insertable=false ,updatable=false)
	private Category category;

	
	@ManyToOne
    @JoinColumn(name="serie_id",insertable=false ,updatable=false)
	private Serie serie;

	
	/*
	@OneToMany
	private List<RestoImage> images;
	*/
	private int zone_id;
	
	private int serie_id;
	
	private int category_id;

	
	public Resto() {

	}

	
	public Resto(int id, String name, String description, String adresse, double long0, double lat, double rank,
			Date openTime, Date closeTime, boolean openWeekEnd, int zone_id, int serie_id, int category_id,String coverImage) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.adresse = adresse;
		this.long0 = long0;
		this.lat = lat;
		this.rank = rank;
		this.openTime = openTime;
		this.closeTime = closeTime;
		this.openWeekEnd = openWeekEnd;
		this.coverImage=coverImage;
		this.zone_id = zone_id;
		this.serie_id = serie_id;
		this.category_id = category_id;
	}




	public Resto(int id, String name, String description, String adresse, double long0, double lat, double rank,
			Date openTime, Date closeTime, boolean openWeekEnd, Zone zone, Category category, Serie serie, int zone_id,
			int serie_id, int category_id) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.adresse = adresse;
		this.long0 = long0;
		this.lat = lat;
		this.rank = rank;
		this.openTime = openTime;
		this.closeTime = closeTime;
		this.openWeekEnd = openWeekEnd;
		this.zone = zone;
		this.category = category;
		this.serie = serie;
		this.zone_id = zone_id;
		this.serie_id = serie_id;
		this.category_id = category_id;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public double getLong0() {
		return long0;
	}

	public void setLong0(double long0) {
		this.long0 = long0;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getRank() {
		return rank;
	}

	public void setRank(double rank) {
		this.rank = rank;
	}

	public Date getOpenTime() {
		return openTime;
	}

	public void setOpenTime(Date openTime) {
		this.openTime = openTime;
	}

	public Date getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(Date closeTime) {
		this.closeTime = closeTime;
	}

	public boolean isOpenWeekEnd() {
		return openWeekEnd;
	}

	public void setOpenWeekEnd(boolean openWeekEnd) {
		this.openWeekEnd = openWeekEnd;
	}

	public Zone getZone() {
		return zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}

	
	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public Serie getSerie() {
		return serie;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
	}

	public int getZone_id() {
		return zone_id;
	}

	public void setZone_id(int zone_id) {
		this.zone_id = zone_id;
	}

	public int getSerie_id() {
		return serie_id;
	}

	public void setSerie_id(int serie_id) {
		this.serie_id = serie_id;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}


	public String getCoverImage() {
		return coverImage;
	}


	public void setCoverImage(String coverImage) {
		this.coverImage = coverImage;
	}

	
/*
	public List<RestoImage> getImages() {
		return images;
	}


	public void setImages(List<RestoImage> images) {
		this.images = images;
	}

*/



	

}
