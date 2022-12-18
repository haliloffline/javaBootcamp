package simulationDemo.core.logging;

public class FileLogger implements ILogger{

	@Override
	public void log(String data) {
		
		System.out.println("Logged to file. "+data);
		
	}

}
