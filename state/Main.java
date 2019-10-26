package design.state;

public class Main {
	
	public static void main(String[] args) {
		State stateA = new ConcreteStateA();
		State stateB = new ConcreteStateB();
		
		Context context = new Context(stateA);
		context.request(1);
		context.request(2);
		context.request(3);
		context.request(4);
		
		context.setState(stateB);
		context.request("sleep");
		context.request("walk");
		context.request("running");
		context.request("eat");
	}
}
