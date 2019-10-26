package design.Factory;

abstract class Car {
	
	public String name;
	
	public void driver() {}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public String getName() {
		return this.name;
	}
}
