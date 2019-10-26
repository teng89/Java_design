package design.Mediator;

public abstract class Mediator {
	
	public abstract void addToList(Person ob);
	
	public abstract void removeFromList(Person ob);
	
	public abstract void sendToAll(Person send,String msg);
	
	public abstract void sendTo(Person send,String name,String msg);
	
}
