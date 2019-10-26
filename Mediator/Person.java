package design.Mediator;

public abstract class Person {
	
	public String name;
	
	public Mediator mediator;

	public Person(String name,Mediator m) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.mediator = m;
	}
	
	public abstract void jion();
	
	public abstract void sendTo(String name,String msg);
	
	public abstract void sendToAll(String msg);
	
	public abstract void getMsg(String msg);
	
	public abstract void getMsgFrom(String msg,String name);
}
