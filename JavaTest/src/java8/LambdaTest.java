package java8;



public class LambdaTest {
	
	public void show() {
		System.out.println("I am show method");
	}

	public static void main(String[] args) {
		
		//for single line
		FunInterface obj1 = (str1,str2) ->  str1 + ", " + str2;
		
		//for multiple lines
		FunInterface obj2 = (str1,str2) -> {
			String result = str1 + ", " + str2;
			return result; };
		
		String result;
		result = obj1.getCustomeMessage("Hello","Bikesh");
		System.out.println(result);
		result = obj2.getCustomeMessage("Welcome to my city", "Bikesh");
		System.out.println(result);
	}
}

@FunctionalInterface
interface FunInterface{
	public String getCustomeMessage(String str1, String str2); 
}