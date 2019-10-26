package design.Facade;

public class ShapeMaker {
	
	private Rectangle rectangle;
	private Circle circle;
	
	public ShapeMaker() {
		// TODO Auto-generated constructor stub
		rectangle = new Rectangle();
		circle = new Circle();
	}
	
	public void drawRectangle() {
		rectangle.draw();
	}
	
	public void drawCircle() {
		circle.draw();
	}

}
