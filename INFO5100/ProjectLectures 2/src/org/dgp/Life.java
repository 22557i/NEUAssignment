package org.dgp;

public class Life {
	
	private class Person {
		private int age;
		private String name;
		
		public Person() {
			super();
			init(1, "John");
		}
		public Person(int age, String name) {
			super();
			init(age, name);
		}
		private void init (int age, String name) {
			this.age = age;
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append(name);
			sb.append(", age ").append(age);
			
			return sb.toString();
//			return "Person [age=" + age + ", name=" + name + "]";
		}
	}

	public int happyBirthday(int age) {
		return ++age;	// another year older
	}

	public int happyBirthday(Person p) {
		p.setAge(p.getAge() + 1);	// another year older
		
		// Back to the Future...
		System.out.println("Present day... " + p);
		p = new Person(89, "Daniel");
		System.out.println("Back in the future... " + p);
		
		return p.getAge();
	}
	public static void demo() {
		System.out.println("\n\t" + Life.class.getName() + ".demo()...");
		
		Life myLife = new Life();	// instantiate an object from Life class

		int myAge = 17;
		String myName = "Dan";
		Person danObject = myLife.new Person(myAge, myName);
		
		System.out.println(myName + " is " + myAge + " years old");	// BEFORE aging
		myLife.happyBirthday(myAge);
		System.out.println(myName + " is " + myAge + " years old");	// AFTER aging
		
		System.out.println(danObject);		// BEFORE aging
		myLife.happyBirthday(danObject);	// AFTER aging
		System.out.println(danObject);
		
		System.out.println("\n\t" + Life.class.getName() + ".demo()... done!");
	}
}
