package design.Command;

public class ConcreteCommandB implements Command{
	
	public Receiver receiver;
	
	public ConcreteCommandB(Receiver r) {
		// TODO Auto-generated constructor stub
		this.receiver = r;
	}
	
	public void doCommand() {
		// TODO Auto-generated method stub
		System.out.println("÷¥––√¸¡ÓB");
		receiver.doCommandTwo();
	}
}
