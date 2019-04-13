package org.dgp;

import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal {
	@Override
	public void speak() {
		System.out.println("I am a dog.");
	}
	public static void demo() {
		System.out.println("\n\t" + Dog.class.getName() + ".demo()...");
		Animal animal = new Animal();
		Dog dog = new Dog();
		animal.speak();
		dog.speak();
		
		List<AbstractAnimalAPI> list = new ArrayList<>();
		list.add(animal);
		list.add(dog);
		System.out.println(list.size() + " animals in list.");
		for (AbstractAnimalAPI obj : list) {
			obj.speak();
		}
		
		System.out.println("\n\t" + Dog.class.getName() + ".demo()...");
	}
}
