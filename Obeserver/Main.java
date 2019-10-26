package design.Obeserver;

import java.util.Observable;

public class Main {
	
	public static void main(String[] args) {
		Subject subject = new ConcreteSubject();
		Observer ob1 = new ConcreteObserver("ob1");
		Observer ob2 = new ConcreteObserver("ob2");
		Observer ob3 = new ConcreteObserver("ob3");
		subject.attach(ob1);
		subject.attach(ob2);
		subject.attach(ob3);
		subject.changeState("change one");
		subject.dettach(ob3);
		subject.changeState("change two");
	}
}
