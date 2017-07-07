/**
 * 
 */
package coreJava.hashCodeEqualsImplementationTest;

import java.sql.Array;
import java.util.Arrays;

/**
 * @author abgupta
 *
 */
public class HashCodeEqualsImplementationTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setAge(20);
		employee.setName("Rajesh");
		employee.setAddress(Arrays.asList("London", "Paris").toArray(new String[0]));
		employee.setIds(new int[] {1,2});
		
		System.out.println(employee);
		
		System.out.println("Hashcode is "+ employee.hashCode());
		
		
	}

}
