package finalexam;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.Buffer;

public class Person extends AbstractPerson{
	private int id;
	private int Age;
	private String name;
	private int WeightLbs;
	private int WeightLossLbs;
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", Age=" + Age + ", name=" + name + ", WeightLbs=" + WeightLbs + ", WeightLossLbs="
				+ WeightLossLbs + "]";
	}
	public Person(String s) {
		super();
		 String[] rows = s.split(",");
		 this.id = Integer.valueOf(rows[0]);
		 this.Age = Integer.valueOf(rows[1]);
		 this.name = rows[2];
		 this.WeightLbs =Integer.valueOf(rows[3]);
		 this.WeightLossLbs = Integer.valueOf(rows[4]);
		// TODO Auto-generated constructor stub
	}
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		this.id = id;
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return Age;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getWeightLbs() {
		// TODO Auto-generated method stub
		return WeightLbs;
	}

	@Override
	public void setWeightLbs(int weightLbs) {
		// TODO Auto-generated method stub
		this.WeightLbs = weightLbs;
		
	}

	@Override
	public int getWeightLossLbs() {
		// TODO Auto-generated method stub
		return WeightLossLbs;
	}

	@Override
	public void setWeightLossLbs(int weightLossLbs) {
		// TODO Auto-generated method stub
		this.WeightLossLbs = weightLossLbs;
	}

}
