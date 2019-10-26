package design.Decorator;

public class Main {

	public static void main(String[] argv) {
		ConcreateComponent con = new ConcreateComponent();
		ConcreteDecoratorA da = new ConcreteDecoratorA(con);
		ConcreteDecoratorB db = new ConcreteDecoratorB(con);
		da.operator();
		db.operator();
	}
}
