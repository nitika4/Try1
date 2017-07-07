/**
 * 
 */
package designPattern.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author abgupta
 *
 */
public class Subject implements Observable {

	private String state;

	private List<Observer> observers = new ArrayList<>();

	@Override
	public void notifyObservers() {
		System.out.println("Notifying Observers!!!");
		for (Observer observer : observers) {
			observer.update();
		}
	}

	@Override
	public void attach(Observer observer) {
		observers.add(observer);
		System.out.println("Added Observer");
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
		System.out.println("Removed Observer");
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
		System.out.println("State changed");
		notifyObservers();
	}

}
