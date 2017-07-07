/**
 * 
 */
package coreJava.thread.joinTest;

/**
 * @author abgupta
 *
 */
public class JoinTest{

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Main Thread executing!");
		Work work = new Work();
		Thread t = new Thread(work);
		t.start();
		try {
			t.join(); // Currently executing thread (main thread) waits for thread t to complete before continung.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main Thread exited!");
	}

}
