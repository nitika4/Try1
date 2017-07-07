/**
 * 
 */
package designPattern.factoryPattern.classRegistrationUsingReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/**
 * @author abgupta
 *
 */
public class Factory {

	private HashMap<String, Class> registerProducts = new HashMap<>(); // map for holding registered products
	
	public void registerProduct(String identifier, Class productClass) {// method to register product.
		registerProducts.put(identifier, productClass);
	}
	
	public Product getProduct(String identifier) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		Class productClass = registerProducts.get(identifier); // get the product Class oject
		Constructor<Product> productConstructor = productClass.getDeclaredConstructor(new Class[]{}); // get the Constructor 
				return productConstructor.newInstance();// instantiate the product
		
	}
	
	//implement as singleton
	private static Factory factory = new Factory();
	
	private Factory(){
	}
	
	public static Factory getInstance() {
		return factory;
	}
}
