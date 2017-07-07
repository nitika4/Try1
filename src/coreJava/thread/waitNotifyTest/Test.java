/**
 * 
 */
package coreJava.thread.waitNotifyTest;

/**
 * @author abgupta
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Machine machine = new Machine();
		Operator operator = new Operator(machine);
		machine.start();
		operator.start();
	}

}
