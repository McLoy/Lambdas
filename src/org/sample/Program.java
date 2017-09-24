package org.sample;

import java.util.ArrayList;
import java.util.List;

public class Program
{
	public static void main(String[] args)
	{
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Daniel", 38));
		persons.add(new Person("Angelo", 7));
		persons.add(new Person("Gottfreid", 3));
		persons.add(new Person("Sasha", 6));
		persons.add(new Person("Ann", 18));

//		for(Person p: persons)
//		{
//			System.out.println(p);
//		}

//		persons.stream()
//		.forEach((Person p) ->
//		{
//			System.out.println(p);
//		});

//		persons.stream()
//		.forEach((p) -> System.out.println(p));

//		persons.stream()
//		.forEach(System.out::println);

		//Filtering
//		persons.stream()
//		.filter(p ->
//		{
//			return p.getAge() >= 18;
//		})
//		.forEach(System.out::println);

//		persons.stream()
//		.filter(p -> p.getAge() >= 18)
//		.forEach(System.out::println);

		//Sorting
//		persons.stream()
//		.filter(p -> p.getAge() >= 18)
//		.sorted((p1, p2) -> p1.getName().compareTo(p2.getName())) //comparator returns positive if p1> p2, 0 if p1=p2 and negative if p1<p2
//		.map(p -> p.getName()) //convert one model data to another
//		.forEach( System.out::println );

//		Get average age of all people in list that older than 18 years
		int summa = 0;
		int adult = 0;
		for(Person p: persons)
		{
			if(p.getAge() >= 18)
			{
				summa += p.getAge();
				adult++;
			}
		}
		double averageAge = (double)summa/adult;
		System.out.println(averageAge);

		double averageAge2 = persons.stream()
		.filter(p -> p.getAge() >= 18)
		.mapToInt(p -> p.getAge())
		.average().getAsDouble();

		System.out.println("Average age via streams: " + averageAge2);
	}
}