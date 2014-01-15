/*Spring scheduling tasks in Spring
http://spring.io/guides/gs/scheduling-tasks/

	Jan 14, 2014*/

package hello;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/*The key components that make this code perform scheduled 
tasks are the @EnableScheduling and @Scheduled annotations.

You use @Scheduled to configure when a particular method is 
run. NOTE: This example uses fixedRate, which specifies the
interval between method invocations measured from the start 
time of each invocation.*/

@EnableScheduling
public class ScheduledTasks {
	
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate=5000)
	public void reportCurrentTime() {
		System.out.println("The time is now " + dateFormat.format(new Date()));
	}
}
