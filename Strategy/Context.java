package design.Strategy;

public class Context {
	
	public Strategy strategy;
	
	public Context(Strategy st) {
		// TODO Auto-generated constructor stub
		this.strategy = st;
	}
	
	public void setStrategy(Strategy st) {
		this.strategy = st;
	}
	
	public void doWork() {
		strategy.strateMethod();
	}
}
