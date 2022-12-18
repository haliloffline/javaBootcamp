package simulationDemo.business;
import java.util.List;
import simulationDemo.core.logging.ILogger;
import simulationDemo.dataAccess.ICategoryDao;
import simulationDemo.entities.Category;

public class CategoryManager {
	
	private ICategoryDao categoryDao;
	private ILogger[] loggers;
	
	
	public CategoryManager(ICategoryDao categoryDao, ILogger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		
	}
	
	public void add(Category category) throws Exception {
		
		Category[] categories = { new Category("1","Backend"),new Category("2","Frontend"), new Category("3","Web") };
		
		for (Category category1 : categories) {
			if(category.getName().equals(category1)) {
				throw new Exception("Categoy name is cannot be repeated.");
			}
		}
		
		categoryDao.add(category);
		for (ILogger logger : loggers) {
			
			logger.log("Category is saved. ");
			
		}
		
		
		
	}
	
	
	
}
