package simulationDemo.core.logging;

public class DatabaseLogger implements ILogger{

	@Override
	public void log(String data) {
		
		System.out.println("Logged to database. "+data);
		
	}
	
	
	
}
