package design.state;

public abstract class State {
	
	public Object state;
	
	public abstract void setState(Object state);
	
	public abstract void handler();
	
}
