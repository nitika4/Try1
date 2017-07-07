/**
 * 
 */
package designPattern.prototypePattern;

/**
 * @author abgupta
 *
 */
public interface PrototypeCapable extends Cloneable{

	// clone method is inherited.
	public PrototypeCapable clone() throws CloneNotSupportedException;
}
