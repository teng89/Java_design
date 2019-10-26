package design.SimpleFactory;

public class Factory {
	
	public Product createProduct(String productName) {
		Product p = null;
		if("A".equals(productName)) { 
			p = new ConcreteProductA();
		} else if("B".equals(productName)) {
			p = new ConcreteProductB();
		}
		return p;
	}
}
