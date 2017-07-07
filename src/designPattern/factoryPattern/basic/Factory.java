/**
 * 
 */
package designPattern.factoryPattern.basic;

/**
 * @author abgupta
 *
 */
public class Factory {

	public Product getProduct(String identifier){
		Product product = null;
			switch (identifier) {
			case "ConcreteProduct1":
				product = new ConcreteProduct1();
				break;
			case "ConcreteProduct2":
				product = new ConcreteProduct2();
				break;

			default:
				break;
			}
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
