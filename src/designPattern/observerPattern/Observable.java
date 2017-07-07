/**
 * 
 */
package designPattern.observerPattern;

/**
 * @author abgupta
 *
 */
public interface Observable {

	void notifyObservers();
	
	void attach(Observer observer);
	
	void detach(Observer observer);
	
	String getState();
	
	void setState(String state);
}
