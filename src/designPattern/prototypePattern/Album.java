/**
 * 
 */
package designPattern.prototypePattern;

/**
 * @author abgupta
 *
 */
public class Album implements PrototypeCapable {

	private String albumName;

	public Album clone() throws CloneNotSupportedException{
		System.out.println("Cloning Album...");
		return (Album)super.clone();
	}
	/**
	 * @return the albumName
	 */
	public String getAlbumName() {
		return albumName;
	}

	/**
	 * @param albumName the albumName to set
	 */
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Album [albumName=" + albumName + "]";
	}
	
	
}
