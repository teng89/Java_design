package design.Builder;

public class BenzBuilder implements CarBuilder{

	Car benz;
	
	public BenzBuilder() {
		// TODO Auto-generated constructor stub
		benz = new Car();
	}
	
	public void setFrame() {
		benz.setCarFrame("���۳���");
	}
	
	public void setWheel() {
		benz.setCarWheel("������̥");
	}
	
	public void setName() {
		benz.setName("����");
	}
	
	public Car getCar() {
		// TODO Auto-generated method stub
		return benz;
	}
}
