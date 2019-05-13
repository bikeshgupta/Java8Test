package java8;

import java.util.Arrays;
import java.util.List;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Bikesh","Maddy","Sweety","Julika");
		
		String str = list.stream()
			.filter(name ->!name.equals("Biesh"))
			.findFirst().orElse(null);
		
		System.out.println(str);
			//.forEach(name -> System.out.println(name))
			///.forEach(System.out::println)
			;

	}

}
