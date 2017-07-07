/**
 * 
 */
package designPattern.factoryPattern.classRegistrationWithoutReflection;

/**
 * @author abgupta
 *
 */
public class ConcreteProduct2 implements Product{

	static{
		Factory.getInstance().registerProduct("ConcreteProduct2", new ConcreteProduct2());
	}
	
	@Override
	public String getName() {
		return "ConcreteProduct2";
	}

}
