package design.Factory;

public class BmwFactory implements CarFactory{

	public Car createCar() {
		// TODO Auto-generated method stub
		return new BmwCar();
	}
}
