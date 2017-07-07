/**
 * 
 */
package designPattern.abstractFactoryPattern;

/**
 * @author abgupta
 *
 */
public class MACWindow implements Window{

	@Override
	public void setTitle(String title) {
		System.out.println("MACWindow Title set is "+ title);
	}

	@Override
	public void repaint() {
		// TODO Auto-generated method stub
		System.out.println("MACWindow is repainted.");
	}

}
