package finalexam;


import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public abstract class AbstractClub {
	/**
	 * Add a person
	 * 
	 * @param p	person to add
	 */
	public abstract void add(AbstractPerson p);
	
	/**
	 * Sort and output to Console all members.
	 * 
	 * @param compare	Comparator for sorting members
	 * @param action	Consumer Action for output to Console
	 */
	public abstract void sortAndShow(Comparator compare, Consumer<AbstractPerson> action);
	
	/**
	 * Get the pounds lost by each member
	 * @return
	 */
	public abstract List<Integer> getWeightLossStats();
}