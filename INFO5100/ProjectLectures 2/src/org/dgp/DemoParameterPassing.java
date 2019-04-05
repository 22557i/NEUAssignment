package org.dgp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DemoParameterPassing {
	private int id = 1;
	private String name = "First";
	List<InnerData> dataList = null;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * inner class N
	 * 
	 * @author dpeters
	 *
	 */
	private class InnerData {
		private int n = 0;

		public InnerData() {
			super();
			n = 1;
		}
		
		public InnerData(int n) {
			super();
			this.n = n;
		}

		public int getN() {
			return n;
		}

		public void setN(int n) {
			this.n = n;
		}

		public void incrementN() {
			this.n++;
		}

		@Override
		public String toString() {
			return " "+ n;
		}
	}
	
	/**
	 * InnerPerson class
	 */
	
	private class InnerPerson {
		private int id;
		private int age;
		private String name;
		
		public InnerPerson() {
			super();
			// TODO Auto-generated constructor stub
		}
		public InnerPerson(int id, int age, String name) {
			super();
			this.id = id;
			this.age = age;
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;;
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
			StringBuilder sb = new StringBuilder("InnerPerson: ");
			
			sb.append("#").append(id);
			sb.append(" ").append(name);
			sb.append(", age ").append(age);
			
			return sb.toString();
		}
	}
	
	public DemoParameterPassing() {
		super();
		this.id = 1;
		this.name = "Object1";
		this.dataList = new ArrayList<DemoParameterPassing.InnerData>();
	}

	public DemoParameterPassing(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.dataList = new ArrayList<DemoParameterPassing.InnerData>();
	}
	
//	public void showObjects(N o1, N o2) {
//		System.out.println("Objects 1 & 2 contain: " + o1.n + " " + o2.n);
//	}
	
	public void showObjects(Object o1, Object o2) {
		System.out.println("Objects 1 & 2 contain: " + o1 + " " + o2);
	}

	public void sillySwap(InnerData o1, InnerData o2) {
		InnerData temp = o1;	// save for later
		
		System.out.println("sillySwap object references:");
		o1 = o2;
		o2 = temp;	// original o1
	}
	
	public void sillySwap(Object o1, Object o2) {
		Object temp = o1;	// save for later
		
		System.out.println("sillySwap Object references:");
		o1 = o2;
		o2 = temp;	// original o1
	}
	
	public void smartSwap(InnerData o1, InnerData o2) {
		DemoParameterPassing obj = new DemoParameterPassing();
		InnerData temp = obj.new InnerData();

		temp.n = o1.n;
		
		System.out.println("smartSwap object state:");
		o1.n = o2.n; 
		o2.n = temp.n; 
	}
	
	public void smartSwap(Integer o1, Integer o2) {
		Integer temp = new Integer(o1.intValue());
		
		System.out.println("smartSwap object state:");
		o1 = o2.intValue(); 
		o2 = temp.intValue(); 
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("DemoParamaterPassing: ");
		
		sb.append(super.toString()).append(" : ");
		sb.append("#").append(this.getId());
		sb.append(" ").append(this.getName());
		
		return sb.toString();
	}
	
	public void useArray() {
		String[] names = { "Peter", "Paul", "Mary"};
		
		System.out.println(names.length + " names in list.");
		for (String name : names) {
			System.out.print(name + ", ");
		}
		System.out.println();
		names[0] = "Peter Yarrow";
		names[1] = "Noel Paul Stookey";
		names[2] = "Mary Travers";
		for (String name : names) {
			System.out.print(name + ", ");
		}
		System.out.println();
	}
	
	public void useArrayList() {
//		String[] nameArray = { "Peter", "Paul", "Mary"};
//		ArrayList<String> names = new ArrayList<String>(Arrays.asList(nameArray));
//		List<String> names = new ArrayList<String>(Arrays.asList(nameArray));
		List<String> names = new ArrayList<>(Arrays.asList("Peter", "Paul", "Mary"));
		
		System.out.println(names.size() + " names in list, namely: " + names + ".");
		for (String name : names) {
			System.out.print(name + ", ");
		}
		System.out.println();
	}
	
	public void useIterator() {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));
		
		System.out.println("useIterator: " + numbers.size() + " numbers in list, namely: " + numbers + ".");
		Iterator<Integer> it = numbers.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + ", ");
		}
		System.out.println();
	}
	
	public void useListIterator() {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));
//		List<Integer> numbers = new Vector<>(Arrays.asList(1, 2, 3));
//		List<Integer> numbers = new LinkedList<>(Arrays.asList(1, 2, 3));
		
		System.out.println("useListIterator: " + numbers.size() + " numbers in list, namely: " + numbers + ".");
		ListIterator<Integer> it = numbers.listIterator();
		while (it.hasNext()) {
			System.out.print(it.next() + ", ");
		}
		while (it.hasPrevious()) {
			System.out.print(it.previous() + ", ");
		}
		System.out.println();
	}
	
	public void showModifyList() {
		List<String> names = new ArrayList<>(Arrays.asList("Adam","Eve","Cain","Able"));
//		List<String> names = new Vector<>(Arrays.asList("Adam","Eve","Cain","Able"));
//		List<String> names = new LinkedList<>(Arrays.asList("Adam","Eve","Cain","Able"));
		
		this.smartUppercaseStrings(names);
		for (String s : names) {
			System.out.println(s + ", ");
		}
		System.out.println();
		
		this.sillyUppercaseStrings(names);
		for (String s : names) {
			System.out.println(s + ", ");
		}
		System.out.println();
	}
	
	public void smartUppercaseStrings(List<String> list) {
		System.out.println("smartUppercaseStrings: " + list.size() + " Strings in list, namely: " + list + ".");
		ListIterator<String> it = list.listIterator();
		while (it.hasNext()) {
			String element = it.next();			// next element in forward direction
			System.out.print(element + ", ");
			it.set(element.toUpperCase());		// modify element in place
		}
		while (it.hasPrevious()) {
			String element = it.previous();		// previous element in reverse direction
			System.out.print(element + ", ");
			it.set(element.toLowerCase());		// modify element in place
		}
	}

	public void sillyUppercaseStrings(List<String> list) {
		System.out.println("sillyUppercaseStrings: " + list.size() + " Strings in list, namely: " + list + ".");
		int i = 0;
		ListIterator<String> it = list.listIterator();
		while (it.hasNext()) {
			String element = it.next();			// next element in forward direction
			System.out.print(element + ", ");
//			it.set(element.toUpperCase());		// modify element in place
			if (list instanceof ArrayList<?>) {
				ArrayList<String> names = (ArrayList<String>) list;
				names.set(i++, element.toUpperCase());
			}
		}
		i--;
		while (it.hasPrevious()) {
			String element = it.previous();		// previous element in reverse direction
			System.out.print(element + ", ");
			if (list instanceof ArrayList<?>) {
				ArrayList<String> names = (ArrayList<String>) list;
				names.set(i--, element.toUpperCase());
			}
		}
	}
	
	public void useListIteratorToModifyelement() {
		List<String> names = new ArrayList<>(Arrays.asList("Adam","Eve","Cain","Able"));
//		List<String> numbers = new Vector<>(Arrays.asList("Adam","Eve","Cain","Able"));
//		List<String> numbers = new LinkedList<>(Arrays.asList("Adam","Eve","Cain","Able"));
		
		System.out.println("useListIterator: " + names.size() + " names in list, namely: " + names + ".");
		ListIterator<String> it = names.listIterator();
		while (it.hasNext()) {
			String element = it.next();			// next element in forward direction
			System.out.print(element + ", ");
			it.set(element.toUpperCase());		// modify element in place
		}
		while (it.hasPrevious()) {
			String element = it.previous();		// previous element in reverse direction
			System.out.print(element + ", ");
			it.set(element.toLowerCase());		// modify element in place
		}
		while (it.hasNext()) {
			System.out.print(it.next() + ", ");
		}
		while (it.hasPrevious()) {
			System.out.print(it.previous() + ", ");
		}
		System.out.println();
	}

	/**
	 * increment integer parameter and return
	 * @param n integer parameter value to increment
	 * @return	incremented integer parameter value
	 */
	public int incrementInteger(int n) {
		return ++n;
	}
	
	public void showPassParameterByValue() {
		int n = 1;	// local variable
		
		System.out.println();
		System.out.println("Watch the Value of n Before calling incrementInteger(n) method call, as a Return value from incrementInteger(n) and After incrementInteger(n) method call: ");
		System.out.print(n);
		System.out.print(this.incrementInteger(n));
		System.out.print(n);
		
		System.out.println();
		System.out.println();
	}
	
	public void showPassReferenceParameterByValue() {
		{
			DemoParameterPassing.InnerData o1 = this.new InnerData();
			DemoParameterPassing.InnerData o2 = this.new InnerData();

			System.out.println(
					"Watch the state of Object 1 and Object 2 Before and after calling sillySwap() and after calling smartSwap(): ");
			o1.n = 1;
			o2.n = 2;
			this.showObjects(o1, o2);

			this.sillySwap(o1, o2);
			this.showObjects(o1, o2);

			this.smartSwap(o1, o2);
			this.showObjects(o1, o2);
		}
		{
			System.out.println("\n Use Integer wrapper class.");
			Integer o1 = new Integer(1);
			Integer o2 = new Integer(2);
			
			this.showObjects(o1, o2);
			this.sillySwap(o1, o2);
			this.showObjects(o1, o2);
			this.smartSwap(o1, o2);
			this.showObjects(o1, o2);
		}
	}
	
	public void createThread(Runnable r) {
		new Thread(r).start();
	}
	
	/**
	 * Pass an anonymous object which implements the Runnable Interface
	 */
	public void passRunnable() {
		createThread(new Runnable() {
			// class member data
			private int id = 1;
			private String name = "Anonymous";
			
			// class member method
			@Override
			public void run() {
				System.out.println("My name is '" + name + "' ID #" + id+ " and I'm running on a new thread!");
			}
		});
	}
	
	/**
	 * @param n integer data to modify
	 */
	public int incrementData(int n) {
		n++;
		return n;
	}
	
	/**
	 * Add specified offset to int
	 * 
	 * @param n integer data to modify
	 * @param offset	integer offset
	 */
	public int offsetData(int n, int offset) {
		n += offset;
		return n;
	}
	
	/**
	 * multiply int by specified factor
	 * 
	 * @param n integer data to modify
	 * @param factor	integer factor
	 */
	public int scaleData(int n, int factor) {
		n *= factor ;
		return n;
	}
	
	/**
	 * Pass an integer 
	 */
	public void passIntegerData() {
		System.out.println("\n\t" + this.getClass().getName() + ".passIntegerData()... ");
		
		// pass integer data to method and use return value
		int a = 1;
		System.out.print(a + ", ");
		System.out.print(incrementData(a) + ", ");
		System.out.print(scaleData(a, 3) + ", ");
		System.out.print(offsetData(a, 100) + ", ");
		System.out.println(a + ", ");

		/*
		 * pass integer data from array to method
		 * and then examine original array data for changes
		 */
		int[] integers = { 1,2,3 };
		
		System.out.println(integers.length + " integers.");
		for (int n : integers) System.out.print(n + ", ");
		
		// increment data
		for (int n : integers) incrementData(n);
		for (int n : integers) System.out.print(n + ", ");
		
		// multiply data by 3
		for (int n : integers) scaleData(n, 3);
		for (int n : integers) System.out.print(n + ", ");
		
		// add 100 to data
		for (int n : integers) offsetData(n, 100);
		for (int n : integers) System.out.print(n + ", ");
		
		System.out.println();
		System.out.println("\n\t" + this.getClass().getName() + ".passIntegerData()... done!");
	}
	
	/**
	 * increment Data object
	 * @param obj object instantiated from class Data
	 */
	public InnerData incrementData(InnerData obj) {
		obj.incrementN();
		return obj;
	}
	
	/**
	 * Add specified offset to Data object
	 * 
	 * @param obj object instantiated from class Data
	 * @param offset	integer offset
	 */
	public InnerData offsetData(InnerData obj, int offset) {
		obj.setN( obj.getN() + offset );
		return obj;
	}
	
	/**
	 * multiply Data object by specified factor
	 * 
	 * @param obj object instantiated from class Data
	 * @param factor	integer factor
	 */
	public InnerData scaleData(InnerData obj, int factor) {
		obj.setN( obj.getN() * factor );
		return obj;
	}
	
	/**
	 * Pass a Data object 
	 */
	public void passDataObject() {
		System.out.println("\n\t" + this.getClass().getName() + ".passDataObject()...");
		
		/*
		 * pass Data object to method
		 * and then examine returned object for changes
		 */
		InnerData myObject = new InnerData(1);	// original Data object
		
		System.out.print(myObject + ", ");	// initial state
		System.out.print(incrementData(myObject) + ", ");
		System.out.print(scaleData(myObject, 3) + ", ");
		System.out.print(offsetData(myObject, 100) + ", ");
		System.out.println(myObject);	// final state
		
		/*
		 * pass Data objects from list to method
		 * and then examine original Data object list for changes
		 */
		
		// add Data objects to list
		dataList.add(new InnerData(1));
		dataList.add(new InnerData(2));
		dataList.add(new InnerData(3));
		
		System.out.println(dataList.size() + " Data objects.");
		dataList.forEach((o) -> System.out.print(o + ", "));
		
		// increment data
		for (InnerData obj : dataList) incrementData(obj);
		dataList.forEach((o) -> System.out.print(o + ", "));
		
		// multiply data by 3
		for (InnerData obj : dataList) scaleData(obj, 3);
		dataList.forEach((o) -> System.out.print(o + ", "));
		
		// add 100 to data
		for (InnerData obj : dataList) offsetData(obj, 100);
		dataList.forEach((o) -> System.out.print(o + ", "));

		System.out.println();
		System.out.println("\n\t" + this.getClass().getName() + ".passDataObject()... done!");
	}
	
	/**
	 * Age persons
	 */
	public List<InnerPerson> agePersons(List<InnerPerson> persons) {
		System.out.println("Age each person in list...");
		for (InnerPerson p : persons) p.setAge(p.getAge() + 1);
		return persons;
	}
	
	public void passInnerPersonObject() {
		System.out.println("\n\t" + this.getClass().getName() + ".passInnerPersonObject()... ");
		
		List<InnerPerson> persons =  new ArrayList<DemoParameterPassing.InnerPerson>();
		persons.add(new InnerPerson(1,67,"George"));
		persons.add(new InnerPerson(2,17,"Dan"));
		persons.add(new InnerPerson(3,27,"Sally"));
		System.out.println(persons.size() + " persons in list.");
		for (InnerPerson p : persons) System.out.println(p);
		
		agePersons(persons);
		for (InnerPerson p : persons) System.out.println(p);
		
		agePersons(persons);
		for (InnerPerson p : persons) System.out.println(p);
		
		agePersons(persons);
		for (InnerPerson p : persons) System.out.println(p);

		System.out.println("\n\t" + this.getClass().getName() + ".passInnerPersonObject()... done!");
	}
	
	/**
	 * demonstrate how an application would use this class.
	 */
	public static void demo() {
		System.out.println("\n\t" + DemoParameterPassing.class.getName() + ".demo()...");
		
		DemoParameterPassing obj = new DemoParameterPassing();

//		obj.showPassParameterByValue();
//		obj.showPassReferenceParameterByValue();
//		obj.useArray();
//		obj.useArrayList();
//		obj.useIterator();
//		obj.useListIterator();
		obj.useListIteratorToModifyelement();
//		obj.showModifyList();
//		obj.passRunnable();
		obj.passIntegerData();
		obj.passDataObject();
		obj.passInnerPersonObject();
		
		System.out.println("\n\t" + DemoParameterPassing.class.getName() + ".demo()... done!\n");
	}
}
