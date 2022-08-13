package reflectionExample;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
//		System.out.println(t.getClass().getSimpleName());
		Class cls = t.getClass();
		System.out.println(cls.getSimpleName());
		
		Method[] arrayOfMethods = cls.getDeclaredMethods();
		System.out.println(arrayOfMethods.length);
		for (Method var: arrayOfMethods) {
			System.out.println(var.getName()+" The Return Type of the method is -->"+var.getReturnType());
			
			Parameter[] params = var.getParameters();
			
			for (Parameter param: params) {
			
			System.out.println("The parameter types is --> " +param.getType());
			
			//System.out.println(var.getModifiers());
		}
	}

}
}
