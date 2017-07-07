/**
 * 
 */
package designPattern.factoryPattern.classRegistrationWithoutReflection;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/**
 * @author abgupta
 *
 */
public class Factory {

	private HashMap<String, Product> registerProducts = new HashMap<>(); // map for holding products instance.
	
	public void registerProduct(String identifier, Product product) {// method to register product.
		registerProducts.put(identifier, product);
	}
	
	public Product getProduct(String identifier) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		Product product = registerProducts.get(identifier); // get the product object
				return product;
		
	}
	
	//implement as singleton
	private static Factory factory = new Factory();
	
	private Factory(){
	}
	
	public static Factory getInstance() {
		return factory;
	}
}
