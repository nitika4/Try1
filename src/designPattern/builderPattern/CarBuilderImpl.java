/**
 * 
 */
package designPattern.builderPattern;

/**
 * @author abgupta
 *
 */
public class CarBuilderImpl implements CarBuilder{

	private Car car;
	
	public CarBuilderImpl(){
		car = new Car();
	}

	@Override
	public Car build() {
		return car;
	}

	@Override
	public CarBuilderImpl setWheels(int wheels) {
		car.setWheels(wheels);
		return this;
	}

	@Override
	public CarBuilderImpl setColor(String color) {
		car.setColor(color);
		return this;
	}
	
	
}
