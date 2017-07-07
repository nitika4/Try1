/**
 * 
 */
package coreJava.clonableTest;

/**
 * @author abgupta
 *
 */
public class ClonableTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Child1 child1 = new Child1();
		try {
			System.out.println(child1.clone());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
