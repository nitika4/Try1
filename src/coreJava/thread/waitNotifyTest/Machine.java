/**
 * 
 */
package coreJava.thread.waitNotifyTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author abgupta
 *
 */
public class Machine extends Thread {

	private List<String> jobs = new ArrayList<>();

	@Override
	public void run() {

		while (true) { // endlessly consume
			synchronized (jobs) {// synchronize on lock of jobs

				if (jobs.isEmpty()) {// if no jobs, then wait
					try {
						jobs.wait(); // wait on jobs's lock to see if any notify
										// occurs.
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				// consume the job.
				System.out.println("Job Name consumed is " + jobs.remove(0));
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}

	public void addJob(String jobName) {
		synchronized (jobs) { // synchronize on lock of jobs
			jobs.add(jobName); // add a job to list
			System.out.println("Job Name added is " + jobName);
			jobs.notify(); // notify that job has been added and can be consumed

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
