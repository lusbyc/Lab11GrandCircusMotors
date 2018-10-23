
public class Car {

	// Build Spec A
	// instance variables
	private String make = "Mock";
	private String model = "Fake";
	private int year = 9999;
	private double price = 10000000000.00;
	
	// Build Spec B
	// no argument constructor
	public Car() {

	}

	// Build Spec C
	public Car(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	// Build Spec D
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// Build Spec E
	@Override
	public String toString() {
		return String.format("%-10s %-10s %-10s %-10s", make, model, year, price);
	}
	
	
	
	
	
}
