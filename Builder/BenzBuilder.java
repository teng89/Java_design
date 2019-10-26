package design.Builder;

public class BenzBuilder implements CarBuilder{

	Car benz;
	
	public BenzBuilder() {
		// TODO Auto-generated constructor stub
		benz = new Car();
	}
	
	public void setFrame() {
		benz.setCarFrame("±¼³Û³µÉí");
	}
	
	public void setWheel() {
		benz.setCarWheel("±¼³ÛÂÖÌ¥");
	}
	
	public void setName() {
		benz.setName("±¼³Û");
	}
	
	public Car getCar() {
		// TODO Auto-generated method stub
		return benz;
	}
}
