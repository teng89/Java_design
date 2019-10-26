package design.Decorator;

public class ConcreteDecoratorA extends Decorator{
	
	public ConcreteDecoratorA(Component com) {
		// TODO Auto-generated constructor stub
		super(com);
	}
	
	@Override
	public void operator() {
		// TODO Auto-generated method stub
		super.operator();
		addOperatorA();
	}
	
	public void addOperatorA() {
		System.out.println("addOperatorA Ìí¼Ó²Ù×÷");
	}

}
