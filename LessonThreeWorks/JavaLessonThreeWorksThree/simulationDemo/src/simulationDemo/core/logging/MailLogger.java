package simulationDemo.core.logging;

public class MailLogger implements ILogger {

	@Override
	public void log(String data) {
		
		System.out.println("Logged to email. "+data);
		
	}
	
	
	
}
