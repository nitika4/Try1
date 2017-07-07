/**
 * 
 */
package designPattern.factoryPattern.basic;

/**
 * @author abgupta
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(Factory.getInstance().getProduct("ConcreteProduct1").getName());
		System.out.println(Factory.getInstance().getProduct("ConcreteProduct2").getName());

	}

}
