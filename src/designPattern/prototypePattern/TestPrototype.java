/**
 * 
 */
package designPattern.prototypePattern;

import designPattern.prototypePattern.PrototypeFactory.TYPE;

/**
 * @author abgupta
 *
 */
public class TestPrototype {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		
		PrototypeCapable moviePrototype = PrototypeFactory.getInstance(TYPE.MOVIE);
		((Movie)moviePrototype).setMovieName("New Movie!");
		System.out.println(moviePrototype);
	
		PrototypeCapable albumPrototype = PrototypeFactory.getInstance(TYPE.ALBUM);
		((Album)albumPrototype).setAlbumName("New Album!");
		System.out.println(albumPrototype);
		
		PrototypeCapable showPrototype = PrototypeFactory.getInstance(TYPE.SHOW);
		((Show)showPrototype).setShowName("New Show!");
		System.out.println(showPrototype);
		
	}

}
