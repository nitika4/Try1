/**
 * 
 */
package designPattern.prototypePattern;

/**
 * @author abgupta
 *
 */
public class Show implements PrototypeCapable{

	private String showName;

	@Override
	public Show clone() throws CloneNotSupportedException{
		System.out.println("Cloning show...");
		return (Show) super.clone();
		
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Show [showName=" + showName + "]";
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}
	
	
}
