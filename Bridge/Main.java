package design.Bridge;

public class Main {
	public static void main(String[] argv) {
		Rectangle blueRec = new Rectangle(new BlueColor());
		blueRec.drawShape();
		Rectangle redRec = new Rectangle(new RedColor());
		redRec.drawShape();
		
		Circle blueC = new Circle(new BlueColor());
		blueC.drawShape();
		Circle redC = new Circle(new RedColor());
		redC.drawShape();
	}
}
