// StreamsExample1

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.function.Consumer;

class StreamsExample1
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
		
		people.stream()
		.filter(p-> p.getLastName().startsWith("C"))
		.forEach(p->System.out.println(p.getFirstName()));
		
		//Stream<Person> stream = people.stream();
		
		long count = people.stream()
		.filter(p-> p.getLastName().startsWith("D"))
		.count();
		
		count = people.parallelStream()
		.filter(p-> p.getLastName().startsWith("D"))
		.count();
		
		System.out.println(count);
	}
}