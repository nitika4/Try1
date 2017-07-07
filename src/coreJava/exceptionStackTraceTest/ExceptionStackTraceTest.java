/**
 * 
 */
package coreJava.exceptionStackTraceTest;

/**
 * @author abgupta
 *
 */
public class ExceptionStackTraceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		print();// prints from where exception occured and rolls up to the
				// caller methods
	}

	private static void print() {
		method1();
	}

	private static void method1() {
		method2();
	}

	private static void method2() {
		throw new RuntimeException("Generate Exception");
	}

}
