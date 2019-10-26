package design.Flyweight;

import java.util.HashMap;

public class PetFactory {
	
	public HashMap<String, Pet> list = new HashMap<String, Pet>();
	
	public void findPet(String name) {
		Pet find = null;
		if(list.containsKey(name)){ 
			find = list.get(name);
			System.out.println(name+"��");
			find.doSomeThing();
		} else {
			System.out.println(name+"û��������һֻ");
			find = new ConcretePet(name);
			list.put(name, find);
			find.doSomeThing();
		} 	 
	}

}
