/**
 * 
 */
package designPattern.observerPattern;

/**
 * @author abgupta
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Observable observable = new Subject(); // create subject
		observable.setState("initial state"); // set state
		
		ConcreteObserverA concreteObserverA = new ConcreteObserverA(observable); // create observer
		ConcreteObserverB concreteObserverB = new ConcreteObserverB(observable); // create observer
		
		//subscribe
		observable.attach(concreteObserverA);
		observable.attach(concreteObserverB);
		
		observable.setState("changed state"); //change state of Subject
		
		//unsubscribe
		observable.detach(concreteObserverA);
		observable.detach(concreteObserverB);
	}

}
