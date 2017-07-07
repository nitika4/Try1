/**
 * 
 */
package designPattern.builderPattern;

/**
 * @author abgupta
 *
 */
public class CarBuildDirector {

	private CarBuilder carBuilder;

	public CarBuildDirector(CarBuilder carBuilder) {
		this.carBuilder = carBuilder;
	}

	public Car construct() {

		return carBuilder.setColor("RED").setWheels(4).build();

	}

	public static void main(String[] args) {
		CarBuilder carBuilder = new CarBuilderImpl();

		CarBuildDirector carBuildDirector = new CarBuildDirector(carBuilder);
		System.out.println(carBuildDirector.construct());
	}

}
