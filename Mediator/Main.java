package design.Mediator;

public class Main {
	public static void main(String[] args) {
		Mediator mediator = new ConcreteMediator();
		Person xiaoming = new ConcretePerson("xiaoming", mediator);
		xiaoming.jion();
		Person xiaohong = new ConcretePerson("xiaohong", mediator);
		xiaohong.jion();
		Person heihei = new ConcretePerson("heihei", mediator);
		heihei.jion();
		Person dada = new ConcretePerson("dada", mediator);
		dada.jion();
		
		xiaohong.sendToAll("xiaohong����ȫԱ�㲥");
		xiaohong.sendTo("dada", "xiaohong�������͸����");
	}

}
