package design.Builder;

public class Car {
	
	public String name;
	
	public String carWheel;
	
	public String carFrame;
	
	public String getCarFrame() {
		return carFrame;
	}
	
	public String getCarWheel() {
		return carWheel;
	}
	
	public void setCarFrame(String carFrame) {
		this.carFrame = carFrame;
	}
	
	public void setCarWheel(String carWheel) {
		this.carWheel = carWheel;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return "name:" + name+"\n¬÷Ã•£∫"+carWheel + "\n≥µ…Ì£∫"+carFrame;
	}
}
