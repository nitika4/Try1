/**
 * 
 */
package designPattern.factoryPattern.classRegistrationUsingReflection;

import java.lang.reflect.InvocationTargetException;

/**
 * @author abgupta
 *
 */
public class Test {

	/**
	 * @param args
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

		//register the products
		Factory.getInstance().registerProduct("ConcreteProduct1", ConcreteProduct1.class);
		Factory.getInstance().registerProduct("ConcreteProduct2", ConcreteProduct2.class);
		
		System.out.println(Factory.getInstance().getProduct("ConcreteProduct1").getName());
		System.out.println(Factory.getInstance().getProduct("ConcreteProduct2").getName());

	}

}
