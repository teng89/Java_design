package design.state;

public class ConcreteStateB extends State{

	private static final String sleep = "sleep";
	private static final String walk = "walk";
	private static final String running = "running";
	
	public ConcreteStateB() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void setState(Object state) {
		// TODO Auto-generated method stub
		super.state = (String)state;
	}
	
	@Override
	public void handler() {
		// TODO Auto-generated method stub
		if(sleep.equals(state)) {
			System.out.println("现在去睡觉");
		} else if(walk.equals(state)) {
			System.out.println("现在去散步");
		} else if(running.equals(state)) {
			System.out.println("现在去奔跑");
		} else {
			System.out.println("未知状态:"+state+"，无法处理");
		}
	}
}
