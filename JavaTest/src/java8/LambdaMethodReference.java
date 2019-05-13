package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaMethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1= new Thread(()->doProcess());
		//1. method reference, if no return and no parameter
		Thread t2= new Thread(LambdaMethodReference::doProcess);
		t2.start();
		
		//2. p->method(p)
		List<Person> list =  Arrays.asList(
				new Person("Bikesh","Gupta"),
				new Person("Kumar","Gaurav"),
				new Person("Abhishek","Rawat")
				);
		printAll(list,System.out::println);
	}
	
	private static void printAll(List<Person> list, Consumer<Person> consumer) {
		for(Person p : list) {
			consumer.accept(p);
		}
		
	}

	static void doProcess() {
		System.out.println("Hello!!!");
	}

}
