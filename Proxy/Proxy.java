package design.Proxy;

public class Proxy extends Subject{

	RealSubject subject;
	
	public Proxy() {
		// TODO Auto-generated constructor stub
		subject = new RealSubject();
	}
	
	@Override
	public void doRequest() {
		// TODO Auto-generated method stub
		subject.doRequest();
	}
}
