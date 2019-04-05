package edu.neu.csye6200;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sorted By Price----------------------------------------");
		Walmart.demo1();
		System.out.println("Sorted By ID----------------------------------------------------------");
		Walmart.demo2();
		System.out.println("Sorted By Calories----------------------------------------------------------");
		Walmart.demo3();
	}
}
/*
 * Sorted By Price----------------------------------------
Electronics:[ Name=22 ,ID=333 ,price=1]
Electronics:[ Name=33 ,ID=444 ,price=2]
Electronics:[ Name=44 ,ID=111 ,price=3]
Electronics:[ Name=22 ,ID=333 ,price=4]
Sorted By ID----------------------------------------------------------
Item [price=4, itemNumber=11, Calories=222]
Item [price=1, itemNumber=22, Calories=333]
Item [price=2, itemNumber=33, Calories=444]
Item [price=3, itemNumber=44, Calories=111]
Sorted By Calories----------------------------------------------------------
Item [price=2, itemNumber=1, Calories=0]
Item [price=3, itemNumber=44, Calories=111]
Item [price=1, itemNumber=22, Calories=333]
Item [price=2, itemNumber=33, Calories=444]*/
 