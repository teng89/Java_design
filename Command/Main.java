package design.Command;

public class Main {
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command commandA = new ConcreteCommandA(receiver);
		Command commandB = new ConcreteCommandB(receiver);
		Invoker invoke = new Invoker(commandA);
		invoke.runCommand();
		invoke.setCommand(commandB);
		invoke.runCommand();
	}
}
