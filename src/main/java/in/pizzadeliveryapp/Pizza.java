package in.pizzadeliveryapp;

public class Pizza {

	public Integer id;
	
	public String name;
	
	public Double price;

	public Pizza(Integer id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pizza [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
}
