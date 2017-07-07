/**
 * 
 */
package designPattern.abstractFactoryPattern;

/**
 * @author abgupta
 *
 */
public class WindowsWidgetFactory implements AbstractWidgetFactory {

	@Override
	public Window createWindow() {
		Window window = new MSWindow();
		return window;
	}

}
