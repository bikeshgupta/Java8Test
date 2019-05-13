package java8;

interface DefaultInterface{
	default void method1() {
		System.out.println("I am Deafult method from DeafultInterface");
	}
	
	static void method2() {
		System.out.println("I am static method from DeafultInterface");
	}
}

public class DefaultInterfaceTest implements DefaultInterface {
	
	void showUses() {
		DefaultInterface.method2(); 
		method1();
		DefaultInterface.super.method1();
	}
	
	public void method1() {
		System.out.println("I am Deafult method from DefaultInterfaceTest");
	}

	public static void main(String[] args) {
		new DefaultInterfaceTest().showUses();
	}

}
