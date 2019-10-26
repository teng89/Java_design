package design.Builder;

public class Main {
	public static void main(String[] args) {
		CarBuilder bmwBuilder = new BmwBuilder();
		CarBuilder benzBuilder = new BenzBuilder();
		Director director = new Director(benzBuilder);
		Car benz = director.productCar();
		System.out.println(benz.toString());
		
		director.setBuilder(bmwBuilder);
		Car bmw = director.productCar();
		System.out.println(bmw.toString());
	}
}
