package design.Mediator;

import java.util.ArrayList;

public class ConcreteMediator extends Mediator{

	ArrayList<Person> list = new ArrayList();
	

	@Override
	public void addToList(Person ob) {
		// TODO Auto-generated method stub
		list.add(ob);
	}

	@Override
	public void removeFromList(Person ob) {
		// TODO Auto-generated method stub
		list.remove(ob);
	}

	@Override
	public void sendToAll(Person send,String msg) {
		// TODO Auto-generated method stub
		for(int i=0; i< list.size(); i++) {
			if(list.get(i)!=send) {
				list.get(i).getMsg(msg);
			}
		}
	}

	@Override
	public void sendTo(Person ob,String name, String msg) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++) {
			if(list.get(i).name.equals(name)) {
				list.get(i).getMsgFrom(msg,ob.name);
			}
		}
	}
}
