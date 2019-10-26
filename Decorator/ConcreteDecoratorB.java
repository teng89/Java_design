package design.Decorator;

public class ConcreteDecoratorB extends Decorator{
	
	public ConcreteDecoratorB(Component com) {
		// TODO Auto-generated constructor stub
		super(com);
	}
	
	@Override
	public void operator() {
		// TODO Auto-generated method stub
		super.operator();
		addOperatorB();
	}
	
	public void addOperatorB() {
		System.out.println("OperatorB Ìí¼Ó²Ù×÷");
	}

}
