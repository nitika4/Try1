/**
 * 
 */
package designPattern.abstractFactoryPattern;

/**
 * @author abgupta
 *
 */
public class MSWindow implements Window{

	@Override
	public void setTitle(String title) {
		System.out.println("MSWindow Title set is "+ title);
	}

	@Override
	public void repaint() {
		// TODO Auto-generated method stub
		System.out.println("MSWindow is repainted.");
	}

}
