/**
 * 
 */
package designPattern.factoryPattern.classRegistrationWithoutReflection;

/**
 * @author abgupta
 *
 */
public class ConcreteProduct1 implements Product{

	static{
		Factory.getInstance().registerProduct("ConcreteProduct1", new ConcreteProduct1());
	}
	
	@Override
	public String getName() {
		return "ConcreteProduct1";
	}

}
