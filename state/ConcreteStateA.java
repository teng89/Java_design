package design.state;

public class ConcreteStateA extends State{

	private static final int speedup = 1;
	private static final int slowdown = 2;
	private static final int brake = 3;
	
	
	public ConcreteStateA() {
		// TODO Auto-generated constructor stub
	}
	
	public void setState(Object state) {
		super.state = (Integer)state;
	};
	
	@Override
	public void handler() {
		// TODO Auto-generated method stub
		switch ((Integer)state) {
		case speedup:
			System.out.println("现在加速");
			break;
		case slowdown:
			System.out.println("现在减速");
			break;
		case brake:
			System.out.println("现在刹车");
			break;

		default:
			System.out.println("未知状态:"+ state +"，无法识别");
			break;
		}
	}
}
