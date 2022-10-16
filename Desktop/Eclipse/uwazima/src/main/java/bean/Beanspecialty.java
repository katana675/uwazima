package bean;

public class Beanspecialty {
private int specialtyid;
	
	private String name;
	
	private String picture;
	
	private String explanation;
	
	public int getId() {
		return specialtyid;
	}
	
	public void setId(int id) {
		this.specialtyid = id;
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
	
	public Beanspecialty(int id, String name, String picture, String explanation) {
		this.specialtyid = id;
		this.name = name;
		this.picture = picture;
		this.explanation = explanation;
	}
}
