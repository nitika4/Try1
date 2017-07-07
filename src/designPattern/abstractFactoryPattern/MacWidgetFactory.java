/**
 * 
 */
package designPattern.abstractFactoryPattern;

/**
 * @author abgupta
 *
 */
public class MacWidgetFactory implements AbstractWidgetFactory{

	@Override
	public Window createWindow() {
		Window window = new MACWindow();
		return window;
	}

}
