/**
 * 
 */
package designPattern.abstractFactoryPattern;

/**
 * @author abgupta
 *
 */
public class GUIBuilder {

	public void buildWindow(AbstractWidgetFactory abstractWidgetFactory) {
		Window window = abstractWidgetFactory.createWindow();
		window.setTitle("New Window!");
	}
}
