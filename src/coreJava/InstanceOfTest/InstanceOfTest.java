/**
 * 
 */
package coreJava.InstanceOfTest;

/**
 * @author abgupta
 *
 */
public class InstanceOfTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Parent parent = new Child();
		if (parent instanceof Parent) {
			System.out.println("true");
		}

		Child child = new Child();
		if (child instanceof Parent) {
			System.out.println("true");
		}

	}

}
