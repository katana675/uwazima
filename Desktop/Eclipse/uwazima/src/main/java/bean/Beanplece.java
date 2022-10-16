package bean;

public class Beanplece {
private int pleceid;
	
	private String name;
	
	private String picture;
	
	private String explanation;
	
	private  String distance;
	
	public int getId() {
		return pleceid;
	}
	
	public void setId(int id) {
		this.pleceid = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPicture() {
		return picture;
	}
	
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	public String getExplanation() {
		return explanation;
	}
	
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	
	public String getDistance() {
		return distance;
	}
	
	public void setDistance(String distance) {
		this.distance =distance;
	}
	
	public Beanplece(int id, String name, String picture, String explanation,String distance) {
		this.pleceid = id;
		this.name = name;
		this.picture = picture;
		this.explanation = explanation;
		this.distance = distance;
	}
}
