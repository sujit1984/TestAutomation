package singletonDP;

public class ComparisonTest {
	/*
	 * 
	 * This program shows the difference between == operation and .equals() method 
	 * 
	 * == operator compares two objects/addresses whereas .equals() method compares the content inside the two operands
	 * 
	 * This program is also used as an example to show the functioning of the SingleTon Design Pattern 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "This is easy";
		String s2 = "This is easy";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String str1 = new String("String Object");
		String str2 = new String("String Object");
		
		System.out.println(str1==str2);  // returns false since str1 and str2 both refer to 2 different objects
		System.out.println(str1.equals(str2));  // returns true since str1 and str2 both contain the same content
		
		
		SingletonTest test1 = SingletonTest.getInstance();
		SingletonTest test2 = SingletonTest.getInstance();  // Only prints "Creating Object" once since both the references test1 and test2 are pointing to the same object 
		
		System.out.println(test1==test2);    // returns true since both of these references are accessing the same object 
	}

}
