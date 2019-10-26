package design.Bridge;

public abstract class Shape {

	public ColorImpl impl;
	
	public Shape(ColorImpl impl) {
		// TODO Auto-generated constructor stub
		this.impl = impl;
	}
	
	public void setImpl(ColorImpl colorp) {
		this.impl = colorp;
	}
	
	abstract void drawShape();
}
