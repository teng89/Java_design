package design.Obeserver;

import java.util.ArrayList;

public abstract class Subject {
	
	public abstract void attach(Object ob); 
	
	public abstract void dettach(Object ob); 
	
	public abstract void nofityOb(Object msg); 
	
	public abstract void changeState(Object msg);
	
}
