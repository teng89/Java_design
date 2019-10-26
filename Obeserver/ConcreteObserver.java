package design.Obeserver;

public class ConcreteObserver extends Observer{
	
	private String name;
	
	public ConcreteObserver(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	@Override
	public void update(Object msg) {
		// TODO Auto-generated method stub
		System.out.println(name +" reciever change:" + (String)msg);
	}

}
