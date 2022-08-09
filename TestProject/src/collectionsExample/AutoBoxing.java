package collectionsExample;

public class AutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int var =10;
		Integer obj = new Integer(var); 	//wrapping or Autoboxing 
		System.out.println(obj);
		
		int i = obj;	// unwrapping  or unboxing 
		System.out.println(i);

	}

}
