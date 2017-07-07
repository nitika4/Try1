/**
 * 
 */
package designPattern.abstractFactoryPattern;

/**
 * @author abgupta
 *
 */
public class Test {

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GUIBuilder guiBuilder = new GUIBuilder();
		AbstractWidgetFactory abstractWidgetFactory = getPlatform();
		guiBuilder.buildWindow(abstractWidgetFactory );
	}

	private static AbstractWidgetFactory getPlatform() {
		AbstractWidgetFactory abstractWidgetFactory = null;
		String platform = "Windows"; // assume platform is Windows
		if(platform.equals("Windows")){
			abstractWidgetFactory = new WindowsWidgetFactory();
		}else if(platform.equals("MAC")){
			abstractWidgetFactory =  new MacWidgetFactory();
		}
		return abstractWidgetFactory;
	}

}
