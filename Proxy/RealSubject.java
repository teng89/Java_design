package design.Proxy;

public class RealSubject extends Subject{
	
	@Override
	public void doRequest() {
		// TODO Auto-generated method stub
		System.out.println("执行真实请求");
	}

}
