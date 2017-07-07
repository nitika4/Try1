/**
 * 
 */
package designPattern.builderPattern;

/**
 * @author abgupta
 *
 *         Represents the product created by the builder.
 */
public class Car {

	private int wheels;

	private String color;

	/**
	 * @return the wheels
	 */
	public int getWheels() {
		return wheels;
	}

	/**
	 * @param wheels the wheels to set
	 */
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car [wheels=" + wheels + ", color=" + color + "]";
	}

}
