package design.Builder;

public class BmwBuilder implements CarBuilder {

	public Car bmw;
	
	public BmwBuilder() {
		bmw = new Car();
	}
	
	public void setFrame() {
		bmw.setCarFrame("宝马车身");
	}
	
	public void setWheel() {
		bmw.setCarWheel("宝马轮胎");
	}
	
	public void setName() {
		bmw.setName("宝马");
	}
	
	public Car getCar() {
		return bmw;
	}
}
