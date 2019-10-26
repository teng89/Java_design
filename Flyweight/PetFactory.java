package design.Flyweight;

import java.util.HashMap;

public class PetFactory {
	
	public HashMap<String, Pet> list = new HashMap<String, Pet>();
	
	public void findPet(String name) {
		Pet find = null;
		if(list.containsKey(name)){ 
			find = list.get(name);
			System.out.println(name+"有");
			find.doSomeThing();
		} else {
			System.out.println(name+"没有重新买一只");
			find = new ConcretePet(name);
			list.put(name, find);
			find.doSomeThing();
		} 	 
	}

}
