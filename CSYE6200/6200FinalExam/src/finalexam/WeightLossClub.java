package finalexam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class WeightLossClub extends AbstractClub {
	
	private ArrayList<AbstractPerson> PersonDirectory ;
	
	public ArrayList<AbstractPerson> getPersonDirectory() {
		return PersonDirectory;
	}


	public void setPersonDirectory(ArrayList<AbstractPerson> personDirectory) {
		PersonDirectory = personDirectory;
	}


	public WeightLossClub() {
		super();
		PersonDirectory = new ArrayList<AbstractPerson>();
	}

	
	public void add(AbstractPerson p) {
		// TODO Auto-generated method stub
		PersonDirectory.add(p);

	}

	@Override
	public void sortAndShow(Comparator compare, Consumer<AbstractPerson> action) {
		// TODO Auto-generated method stub
		PersonDirectory.stream().sorted(compare).forEach(action);

	}

	@Override
	public List<Integer> getWeightLossStats() {
		// TODO Auto-generated method stub
		return null;
	}
	public void show(int i) {
		

			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	
	public  static void demo() {
		WeightLossClub wlClub = new WeightLossClub();
		Comparator<Person> sortbyweightloss = new Comparator<Person>() {
        	public int compare(Person o1,Person o2) {
        		return o1.getWeightLossLbs()>o2.getWeightLossLbs()?1:-1;
        	}
		};
		Comparator<Person> descending = new Comparator<Person>() {
        	public int compare(Person o1,Person o2) {
        		return o2.getWeightLossLbs()>o1.getWeightLossLbs()?1:-1;
        	}
		};
		Consumer<AbstractPerson> ucon = s -> System.out.println(s.toString());
		String s1 =      "1,25,Jim,311,11";
		String s2 =       "2,21,Sam,315,15";
		String s3 =      "3,17,Dan,314,14";
		String s4 =     "4,19,Bob,312,12";
		String s5 =      "5,16,Ann,310,10";
		String s6 =      "6,23,Eve,313,13";
		
		
		
	
		
	
		
		
        /**
         * Instantiate Person objects from the following CSV data
         * formatted as follows:
         * 
         * "id,age,name,weightLbs,weightLossLbs"
        */
		Person p1 = new Person(s1);
		Person p2 = new Person(s2);
		Person p3 = new Person(s3);
		Person p4 = new Person(s4);
		Person p5 = new Person(s5);
		Person p6 = new Person(s6);

        /**
         * add all Persons to weight loss club
         */
		wlClub.add(p1);
		wlClub.add(p2);
		wlClub.add(p3);
		wlClub.add(p4);
		wlClub.add(p5);
		wlClub.add(p6);

        /**
         * sort all members by name
         * 
         */
		
        System.out.println("sort all members by name");
        
        wlClub.sortAndShow(new Comparator<Person>() {
        	public int compare(Person o1,Person o2) {
        		return o1.getName().compareTo(o2.getName());
        	}
		},ucon);

        /**
         * sort all members by WeightLoss
         */
        System.out.println("---------------------------------------------");
        System.out.println();
        System.out.println("sort all members by WeightLoss");
        wlClub.sortAndShow(sortbyweightloss,ucon);
        System.out.println("---------------------------------------------");
        System.out.println();

        /**
         * Graph current weight loss numbers (show magnitude using text Output to Console)
         * Show on Console Sorted in INCREASING order
         * followed immediately by DECREASING order
         */
        System.out.println("Show MAGNITUDE GRAPH of Current WeightLoss:");
        System.out.println("Ascending order-------------");
        wlClub.sortAndShow(sortbyweightloss,s-> wlClub.show(s.getWeightLossLbs()));
        System.out.println("descending order----------------");
        wlClub.sortAndShow(descending,s-> wlClub.show(s.getWeightLossLbs()));
        /**
         * Graph PROJECTED weight loss numbers (show magnitude using text Output to Console)
         * AFTER Members have been on Club Diet for 1 month (where each member is projected to lose 10 pounds)
         * Show on Console Sorted in INCREASING order
         * followed immediately by DECREASING order
         */
        System.out.println("Show MAGNITUDE GRAPH of WeightLoss AFTER 1 Month DIET ALONE:");
        System.out.println("Ascending order-------------");
        wlClub.sortAndShow(sortbyweightloss,s-> wlClub.show(s.getWeightLossLbs()+10));
        System.out.println("descending order----------------");
        wlClub.sortAndShow(descending,s-> wlClub.show(s.getWeightLossLbs()+10));
        /**
         * Graph PROJECTED weight loss numbers (show magnitude using text Output to Console)
         * AFTER Members have been on Club Diet and Exercise for 1 year (where each member is projected to lose 10 times more weight)
         * Show on Console Sorted in INCREASING order
         * followed immediately by DECREASING order
         */
        System.out.println("Show MAGNITUDE GRAPH of WeightLoss AFTER DIET AND EXERCISE:");
        System.out.println("Ascending order-------------");
        wlClub.sortAndShow(sortbyweightloss,s-> wlClub.show(s.getWeightLossLbs()*10));
        System.out.println("descending order----------------");
        wlClub.sortAndShow(descending,s-> wlClub.show(s.getWeightLossLbs()*10));
}



	
}
/*
Complete the entire programming exercise within the alloted time period and submit to blackboard (just like an assignment).

COMPLETE WHAT YOU CAN DO!!!  DO NOT GET STUCK ON ONE PART OF THE PROGRAM!!!

20 POINTS DEDUCTION IF LATE OR IN WRONG FORMAT, SPECIFICALLY:

 *     1. Submit completed program (in zip compressed eclipse workspace) to blackboard On-time,
 *  2. Program MUST BE Executable,
 *  3. Eclipse workspace MUST BE correctly named and zip compressed
 *   (e.g. named like 'workspace_o2_dan_peters_final' and zipped as 'workspace_o2_dan_peters_final.zip'),
 *  4. Console output MUST BE cut and pasted at end of main() method as comment.

PART I (30 TOTAL POINTS): Create TwoAlternatingThreads class



 * Design a class that will start TWO alternating threads  (10 POINTS) demonstrating control as they alternate output to the console (10 POINTS).
 * Two threads take turns alternating the output of all the letters of the alphabet (10 POINTS) (LOWERCASE and UPPERCASE) to console (aAbAcCdD... etc.).
 *

 * 30 TOTAL POINTS FOR PART I IS BROKEN DOWN AS FOLLOWS:
 * 10 POINTS:  Output ENTIRE alphabet upper case and lower case to console
 * 10 POINTS:  Create and Start TWO Threads

 * 10 POINTS:  Control TWO Threads so they ALTERNATE output to console
Part II (70 TOTAL POINTS): Design a class to demonstrate The People's Weight Club
 * 70 TOTAL POINTS FOR PART II IS BROKEN DOWN AS FOLLOWS:
 * (10 POINTS):  Derive Person class from AbstractPerson class;
 * 
 * (10 POINTS):  Derive WeightLossClub from AbstractClub class;
 * (10 POINTS):  Create Persons from the following CSV data (formatted as "id,age,name,weightLbs,weightLossLbs"):
 * 
          String p1=      "1,25,Jim,311,11"
         String p2 =       "2,21,Sam,315,15"
          String p3=      "3,17,Dan,314,14"
           String p4 =     "4,19,Bob,312,12"
          String p5=      "5,16,Ann,310,10"
          String p6 =      "6,23,Eve,313,13"
 * 
 * (40 POINTS):  Add each person to club and complete the demo method as directed below and where points are as follows:
 *         40 TOTAL POINTS for demo IS BROKEN DOWN AS FOLLOWS:
 *         5 POINTS: Show ALL Member info (Person state) sorted by name
 *         5 POINTS: Show ALL Member info (Person state) sorted by WeightLoss
 * 
 *         10 POINTS: GRAPH Current Weight Loss
 *         10 POINTS: GRAPH Projected 1  month Weight Loss
 *         10 POINTS: GRAPH Projected 12 month Weight Loss
 * 
    static void demo() {

        /**
         * Instantiate Person objects from the following CSV data
         * formatted as follows:
         * 
         * "id,age,name,weightLbs,weightLossLbs"
        


        /**
         * add all Persons to weight loss club
         *


        /**
         * sort all members by name
         *
        System.out.println("sort all members by name");


        /**
         * sort all members by WeightLoss
         *
        System.out.println("sort all members by WeightLoss");


        /**
         * Graph current weight loss numbers (show magnitude using text Output to Console)
         * Show on Console Sorted in INCREASING order
         * followed immediately by DECREASING order
         *
        System.out.println("Show MAGNITUDE GRAPH of Current WeightLoss:");


        /**
         * Graph PROJECTED weight loss numbers (show magnitude using text Output to Console)
         * AFTER Members have been on Club Diet for 1 month (where each member is projected to lose 10 pounds)
         * Show on Console Sorted in INCREASING order
         * followed immediately by DECREASING order
         *
        System.out.println("Show MAGNITUDE GRAPH of WeightLoss AFTER 1 Month DIET ALONE:");


        /**
         * Graph PROJECTED weight loss numbers (show magnitude using text Output to Console)
         * AFTER Members have been on Club Diet and Exercise for 1 year (where each member is projected to lose 10 times more weight)
         * Show on Console Sorted in INCREASING order
         * followed immediately by DECREASING order
         *
        System.out.println("Show MAGNITUDE GRAPH of WeightLoss AFTER DIET AND EXERCISE:");

}*/
