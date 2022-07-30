package bean;

public class Bean {
	private int id;
	
	private String name;
	
	private String content;
	
	private  int price;
	
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
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price =price;
	}
	
	public Bean(int id, String name, String content, int price) {
		this.id = id;
		this.name = name;
		this.content = content;
		this.price = price;
	}
}
