/**
 * 
 */
package designPattern.factoryPattern.classRegistrationWithoutReflection;

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
	public static void main(String[] args) throws InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

		// register the products by loading classes
		try {
			Class.forName("designPattern.factoryPattern.classRegistrationWithoutReflection.ConcreteProduct1");
			Class.forName("designPattern.factoryPattern.classRegistrationWithoutReflection.ConcreteProduct2");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(Factory.getInstance().getProduct("ConcreteProduct1").getName());
		System.out.println(Factory.getInstance().getProduct("ConcreteProduct2").getName());

	}

}
