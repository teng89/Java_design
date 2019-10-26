package design.state;

public class Context {
	
	public State state;
	
	public Context(State st) {
		this.state = st;
	}
	
	public void setState(State s) {
		this.state = s;
	}
	
	public void request(Object st) {
		state.setState(st);
		state.handler();
	}
}
