package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CollectionStreamExample {

	public static void main(String[] args) {
		List<Person> list =  Arrays.asList(
				new Person("Bikesh","Gupta"),
				new Person("Bikesh","Kumar"),
				new Person("Kumar","Gaurav"),
				new Person("Sujit","Kumar"),
				new Person("Abhishek","Rawat")
				);
		//External iterator : managed by us
		for(Person p : list) {
			System.out.println(p);
		}
		
		//Internal iterator : 
		list.forEach(p->System.out.println(p));
		list.forEach(System.out::println);

		//streaming
		list.stream().forEach(p->System.out.println(p.getFname()));
		
		//Optional<Person> person = 
		 Person count = list.stream()
		.filter(p->p.getLname().startsWith("K"))
		.findFirst().orElse(null);
		//.count();
		//.forEach(System.out::println);;
		
		 System.out.println(count);
		 
		//System.out.println(person.getFname());
	}

}
