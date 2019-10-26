package design.Factory;

public class Main {
	public static void main(String[] args) {
		CarFactory benzF = new BenzFactory();
		Car benz = benzF.createCar();
		benz.driver();
	}
}
