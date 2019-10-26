package design.Flyweight;

public class Main {

	public static void main(String[] argv){
		PetFactory factory = new PetFactory();
		factory.findPet("dog");
		factory.findPet("cat");
		factory.findPet("dog");
	}
}
