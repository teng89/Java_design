package design.Builder;

public class BmwBuilder implements CarBuilder {

	public Car bmw;
	
	public BmwBuilder() {
		bmw = new Car();
	}
	
	public void setFrame() {
		bmw.setCarFrame("������");
	}
	
	public void setWheel() {
		bmw.setCarWheel("������̥");
	}
	
	public void setName() {
		bmw.setName("����");
	}
	
	public Car getCar() {
		return bmw;
	}
}
