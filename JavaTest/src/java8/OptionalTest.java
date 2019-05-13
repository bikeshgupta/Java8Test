package java8;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {

		Integer num1 = 10;
		Integer num2 = null;
		
		System.out.println(multiply(num1,num2));

	}

	private static Integer multiply(Integer num1, Integer num2) {
		//num1 = Optional.ofNullable(num1).orElse(1);
		num1 = num1==null?1:num1;
		num2 = Optional.ofNullable(num2).orElse(1);
		return num1*num2;
	}



}
