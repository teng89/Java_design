package design.Mediator;


public class ConcretePerson extends Person{

	public ConcretePerson(String name,Mediator mediator) {
		// TODO Auto-generated constructor stub
		super(name,mediator);
	}
	
	@Override
	public void jion() {
		// TODO Auto-generated method stub
		mediator.addToList(ConcretePerson.this);
	}
	
	@Override
	public void getMsg(String msg) {
		// TODO Auto-generated method stub
		System.out.println(name+"�յ�ȫԱ�㲥�� "+ msg);
	}
	
	@Override
	public void getMsgFrom(String msg, String name) {
		// TODO Auto-generated method stub
		System.out.println(ConcretePerson.this.name+"�յ�����"+name+"��˽�ţ�" + msg);
	}
	
	@Override
	public void sendTo(String name,String msg) {
		// TODO Auto-generated method stub
		mediator.sendTo(ConcretePerson.this,name,msg);
	}
	
	@Override
	public void sendToAll(String msg) {
		// TODO Auto-generated method stub
		System.out.println(name+"�������͹㲥");
		mediator.sendToAll(ConcretePerson.this,msg);
	}
}
