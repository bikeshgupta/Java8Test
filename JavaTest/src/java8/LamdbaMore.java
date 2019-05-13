package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LamdbaMore {

	public static void main(String[] args) {
		List<Person> list =  Arrays.asList(
				new Person("Bikesh","Gupta"),
				new Person("Kumar","Gaurav"),
				new Person("Abhishek","Rawat")
				);
		
		printAllWithCondition(list,p1->p1.getLname().startsWith("G"));
		
		performWithCondtions(list,p->p.getLname().startsWith("R"),p-> System.out.println("Mr. "+p.getFname()));
		
		//Exception handling
		
		
		
		
		
	}

	private static void performWithCondtions(List<Person> list, Predicate<Person> predicate, Consumer<Person> consumer) {
		for(Person p : list) {
			if(predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}

	private static void printAllWithCondition(List<Person> list, Predicate<Person> predicate) {
			for(Person p : list) {
				if(predicate.test(p)) {
					System.out.println(p);
				}
			}
		
	}

}
