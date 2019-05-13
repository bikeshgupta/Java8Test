package java8;

public class DefaultMethodsTest implements DeafultMethods {
	
	DefaultMethodsTest(){
		System.out.println(DeafultMethods.super.getMessage("Rahul"));
		System.out.println(DeafultMethods.super.getMessage2("Rahul"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DefaultMethodsTest();

	}

}
