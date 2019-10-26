package design.Bridge;

public class Circle extends Shape{
	
	public Circle(ColorImpl impl) {
		super(impl);
		// TODO Auto-generated constructor stub
	}

	@Override
	void drawShape() {
		// TODO Auto-generated method stub
		System.out.println("first draw a circle");
		impl.drawColor();
	}

}
