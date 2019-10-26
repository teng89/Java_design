package design.Command;

public class Invoker {
	
	public Command command;
	
	public Invoker(Command cm) {
		// TODO Auto-generated constructor stub
		this.command = cm;
	}
	
	public void setCommand(Command com) {
		this.command = com;
	}
	
	public void runCommand() {
		command.doCommand();
	}
}	
