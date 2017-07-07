/**
 * 
 */
package designPattern.builderPattern;

/**
 * @author abgupta
 *
 */
public interface CarBuilder {

		Car build();
		
	CarBuilder	setWheels(int wheels);
		
	CarBuilder	setColor(String color);
}
