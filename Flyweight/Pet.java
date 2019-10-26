package design.Flyweight;

public abstract class Pet {
	public String name;
	public int age;
	
	public Pet(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	abstract void doSomeThing();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
