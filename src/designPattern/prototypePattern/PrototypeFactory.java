/**
 * 
 */
package designPattern.prototypePattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author abgupta
 *
 */
public class PrototypeFactory {

	public enum TYPE {
		MOVIE, SHOW, ALBUM
	}

	private static Map<TYPE, PrototypeCapable> prototypes = new HashMap<>();

	static {
		prototypes.put(TYPE.MOVIE, new Movie());
		prototypes.put(TYPE.SHOW, new Show());
		prototypes.put(TYPE.ALBUM, new Album());
	}

	public static PrototypeCapable getInstance(TYPE type) throws CloneNotSupportedException {
		return prototypes.get(type).clone();
	}

}
