/**
 * 
 */
package coreJava.thread.waitNotifyTest;

/**
 * @author abgupta
 *
 */
public class Operator extends Thread {

	private Machine machine;// initilaise machine via constructor
	private int counter = 0;

	public Operator(Machine machine) {
		this.machine = machine;
	}

	@Override
	public void run() {
		while (true) { // endlessly add Job
			String jobName = getJob(); // get Job
			machine.addJob(jobName); // call method to add a job to job list
		}
	}

	private String getJob() {
		return "JobName" + ++counter; // return Job Name
	}
}
