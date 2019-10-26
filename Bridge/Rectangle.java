package design.Bridge;

public class Rectangle extends Shape{

	public Rectangle(ColorImpl impl) {
		super(impl);
		// TODO Auto-generated constructor stub
	}

	@Override
	void drawShape() {
		// TODO Auto-generated method stub
		System.out.println("first draw a Rectangle");
		impl.drawColor();
	}
}
