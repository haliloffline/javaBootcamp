package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		
//		EmailLogger logger = new EmailLogger();
//		logger.log("log mesaj�");
		
//		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(),new DataBaseLogger(), new EmailLogger(), new ConsoleLogger()};
//		
//		for (BaseLogger logger : loggers) {
//			logger.log("log mesaj�");
//		}
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();
		
		
		
	}

}
