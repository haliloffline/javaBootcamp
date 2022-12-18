package simulationDemo.business;

import simulationDemo.core.logging.ILogger;
import simulationDemo.dataAccess.IEducatorDao;
import simulationDemo.entities.Educator;

public class EducatorManager {
	
	private IEducatorDao educatorDao;
	private ILogger[] loggers;
	
	public EducatorManager(IEducatorDao educatorDao, ILogger[] loggers) {
		super();
		this.educatorDao = educatorDao;
		this.loggers = loggers;
	}
	
	
	
	public void add(Educator educator) {
		educatorDao.add(educator);
		for (ILogger logger : loggers) {
			logger.log(educator.getFirstName()+" "+educator.getLastName());
		}
		
		
	}
	
}
