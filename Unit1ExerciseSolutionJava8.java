// unit1exercisejava8
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

class Unit1ExerciseSolutionJava8
{
	public static void main(String[] args)
	{
		List<Person> people = Arrays.asList(
			new Person("Charles", "Dickens", 60),
			new Person("Lewis", "Carroll", 42),
			new Person("Thomas", "Carlyle", 51),
			new Person("Charlotte", "Bronte", 45),
			new Person("Matthew", "Arnold", 39)
			);
			
		// Step 1: Sort list by last name
		Collections.sort(people, (p1, p2)->p1.getLastName().compareTo(p2.getLastName()));
		// Step 2: Create a method that prints all elements in the list
		System.out.println("Printing all people");
		printConditionally(people, p->true);
		
		// Step 3: Create a method that prints all people that have last naem beginning with C
		System.out.println("Printing all people with last names beginning with C");
		printConditionally(people, p -> p.getLastName().startsWith("C"));
		
		System.out.println("Printing all people with first names beginning with C");
		printConditionally(people, p ->  p.getFirstName().startsWith("C"));
	}
	private static void printConditionally(List<Person> people, Condition condition)
	{
		for ( Person p: people )
		{
			if ( condition.test(p) )
				System.out.println(p);
		}
	}
}


interface Condition
{
	boolean test(Person p);
}