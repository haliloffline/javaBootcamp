package simulationDemo;

import simulationDemo.business.CategoryManager;
import simulationDemo.business.CoursesManager;
import simulationDemo.business.EducatorManager;
import simulationDemo.core.logging.DatabaseLogger;
import simulationDemo.core.logging.FileLogger;
import simulationDemo.core.logging.ILogger;
import simulationDemo.core.logging.MailLogger;
import simulationDemo.dataAccess.HibernateDao;
import simulationDemo.entities.Category;
import simulationDemo.entities.Courses;
import simulationDemo.entities.Educator;

public class Main {

	public static void main(String[] args) throws Exception {

		ILogger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		Category category = new Category("4", "Android");
		CategoryManager categoryManager = new CategoryManager(new HibernateDao(), loggers);
		categoryManager.add(category);

		Courses course = new Courses("4", 120, "Java kotlin geli�tirme kamp�.",
				"Bu kursumuzda java kotlin android geli�tirme ��renece�iz.", "kotlinBanner.jpg");
		CoursesManager coursesManager = new CoursesManager(new HibernateDao(), loggers);
		coursesManager.add(course);

		Educator educator = new Educator("1", "Engin", "Demiro�", "Yaz�l�m geli�tirme uzman�",
				"A��rl�kl� olarak Savunma Sanayisi, Bankac�l�k sekt�rlerine kurumsal yaz�l�m geli�tirme s�re�leri konusunda dan��manl�k veriyorum.",
				"enginDemirogFoto.jpg");
		EducatorManager educatorManager = new EducatorManager(new HibernateDao(), loggers);
		educatorManager.add(educator);

	}

}
