package design.Command;

public class ConcreteCommandA implements Command{

	public Receiver receiver;
	
	public ConcreteCommandA(Receiver r) {
		// TODO Auto-generated constructor stub
		this.receiver = r;
	}
	
	public void doCommand() {
		// TODO Auto-generated method stub
		System.out.println("÷¥––√¸¡ÓA");
		receiver.doCommandOne();
	}
}
