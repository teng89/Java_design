package design.Builder;

public class Director {
	
	public CarBuilder builder;
	
	public Director(CarBuilder build) {
		// TODO Auto-generated constructor stub
		this.builder = build;
	}
	
	public void setBuilder(CarBuilder builder) {
		this.builder = builder;
	}
	
	
	public Car productCar() {
		builder.setFrame();
		builder.setName();
		builder.setWheel();
		return builder.getCar();
	}
}
