package singletonDP;

public class SingletonTest {
	
	
	private static SingletonTest instance = new SingletonTest();
	
	private SingletonTest() {
		System.out.println("Creating Object");
		
		
	}

	public static SingletonTest getInstance() {
		
		return instance;
	}


}
