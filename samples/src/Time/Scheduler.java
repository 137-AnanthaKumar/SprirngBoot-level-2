package Time;

import java.util.Timer;

public class Scheduler {
	public static void main(String args[]) throws InterruptedException {

		Timer time = new Timer(); // Instantiate Timer Object
		Schedulerr st = new Schedulerr(); // Instantiate SheduledTask class
		time.schedule(st, 0, 10000); // Create Repetitively task for every 1 secs
		
//for demo only.
//		for (int i = 0; i <= 5; i++) {
//			System.out.println("Execution in Main Thread...." + i);
//			st.run();
//			Thread.sleep(2000);
//			if (i == 5) {
//				System.out.println("Application Terminates");
//				System.exit(0);
//			}
		}
//	}
}
