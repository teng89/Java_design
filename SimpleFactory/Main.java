package design.SimpleFactory;

public class Main {
	public static void main(String[] args) {
		Factory factory = new Factory();
		Product p = factory.createProduct("A");
		p.use();
	}
}
