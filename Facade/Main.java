package design.Facade;

public class Main {
	public static void main(String[] argv) {
		ShapeMaker maker = new ShapeMaker();
		maker.drawCircle();
		maker.drawRectangle();
	}
}
