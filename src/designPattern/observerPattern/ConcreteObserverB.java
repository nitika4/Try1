/**
 * 
 */
package designPattern.observerPattern;

/**
 * @author abgupta
 *
 */
public class ConcreteObserverB implements Observer{

	private Observable observable;
	
	public ConcreteObserverB(Observable observable) {
		this.observable = observable;
	}
	private String state;
	
	@Override
	public void update() {
		setState(observable.getState());
		System.out.println("Updated ConcreteObserverB state to: "+state);
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

}
