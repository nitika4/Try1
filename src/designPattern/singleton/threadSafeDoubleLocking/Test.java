/**
 * 
 */
package designPattern.singleton.threadSafeDoubleLocking;

/**
 * @author abgupta
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(Singleton.getInstance().equals(Singleton.getInstance()));
	}

}
