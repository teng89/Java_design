package design.Obeserver;

import java.util.ArrayList;

public class ConcreteSubject extends Subject{
	
	public ArrayList<Observer> list = new ArrayList<Observer>();
	
	private String message;
	
	public ConcreteSubject() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void attach(Object ob) {
		// TODO Auto-generated method stub
		list.add((Observer)ob);
	};
	
	@Override
	public void dettach(Object ob) {
		// TODO Auto-generated method stub
		list.remove((Observer)ob);
	}
	
	@Override
	public void changeState(Object msg) {
		// TODO Auto-generated method stub
		this.message = (String)msg;
		nofityOb(msg);
	}
	
	@Override
	public void nofityOb(Object msg) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++) {
			list.get(i).update(msg);
		}
	}
}
