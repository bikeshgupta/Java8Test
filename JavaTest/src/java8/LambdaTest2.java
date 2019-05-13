package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaTest2 {

	public static void main(String[] args) {
		// till java 7
		Greeting greet = new Greeting() {
			public void perform(String s) {
				System.out.println("Hello JAVA!!");
			}			
		};
		greet.perform("S");
		
		//in java8
		//Greeting greetJ8 = (String s) -> System.out.println("Hello"+s);
		//Greeting greetJ8 = ( s) -> System.out.println("Hello"+s);
		Greeting greetJ8 = s -> System.out.println("Hello"+s);
		greetJ8.perform("Java 8");
		
		//with runnable interface | can be with Interface having only one abstarct method
		/*Thread t = new Thread(new Runnable() {
			public void run() {
				System.out.println("Running Tread"));
			}
		});*/
		Thread t = new Thread(()-> System.out.println("Running Tread"));
		t.start();
		
		//Functional Interface - Interfaces which are use for Lambda expression are Functional interface, we can annotate it with @FunctionalInterface it is completely optional but good for practice 

		//Lambda with collections
		List<Person> list =  Arrays.asList(
				new Person("Bikesh","Gupta"),
				new Person("Kumar","Gaurav"),
				new Person("Abhishek","Rawat")
				);
		//sort by last name
		Collections.sort(list, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLname().compareTo(o2.getLname());
			}
			
		});
		//print all -- Java7
		printAll(list);
		
		
		//print last name begin with G  -- Java7
		printStartWithCondition(list,p->true);
		
		//print with condition  -- Java7
		printStartWithCondition(list,new Condition(){

			@Override
			public boolean test(Person p) {
				return p.getLname().startsWith("R");
			}
			
		});
		
		//Now with java 8
		Collections.sort(list,( p1, p2) ->  p1.getLname().compareTo(p2.getLname()));
		//print with condition  -- Java8
		printStartWithCondition(list,p->p.getLname().startsWith("G"));
	}
	
	private static void printStartWithCondition(List<Person> list, Condition condition) {
		for(Person p : list) {
			if(condition.test(p))
			System.out.println(p.getFname() + " " + p.getLname());
		}
		
	}
	
	private static void printStartWithG(List<Person> list) {
		for(Person p : list) {
			if(p.getLname().startsWith("G"))
			System.out.println(p.getFname() + " " + p.getLname());
		}
		
	}
	private static void printAll(List<Person> list) {
		for(Person p : list) {
			System.out.println(p.getFname() + " " + p.getLname());
		}
	}

}

interface Condition{
	boolean test(Person P);
}

class Person{
	String fname;
	String lname;
	Person(String f,String l){
		fname=f;
		lname=l;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
}