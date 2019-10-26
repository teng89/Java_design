package design.Strategy;

public class Main {
	
	public static void main(String[] argv) {
		Strategy stragegyA = new ConcreteStrategyA();
		Strategy stragegyB = new ConcreteStrategyB();
		
		Context context = new Context(stragegyA);
		context.doWork();
		
		context.setStrategy(stragegyB);
		context.doWork();
	}

}
