package design.Factory;

public class BenzFactory implements CarFactory{
	
	public Car createCar() {
		// TODO Auto-generated method stub
		return new BenzCar();
	}
}
