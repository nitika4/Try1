/**
 * 
 */
package designPattern.singleton.threadSafeDoubleLocking;

/**
 * @author abgupta
 *
 */
public class Singleton {

	private static Singleton singleton; // get an instance

	private Singleton() {
		// make constructor private
	}

	public static Singleton getInstance() {
		if (singleton == null) { // if instance is null
			synchronized (Singleton.class) { // synchronize at Class object
				if (singleton == null) { // double check for null
					singleton = new Singleton(); // create an instance.
				}
			}
		}
		return singleton;

	}

}
