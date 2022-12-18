package simulationDemo.business;

import simulationDemo.core.logging.ILogger;
import simulationDemo.dataAccess.ICoursesDao;
import simulationDemo.entities.Courses;

public class CoursesManager {

	private ICoursesDao courseDao;
	private ILogger[] loggers;

	public CoursesManager(ICoursesDao courseDao, ILogger[] loggers) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Courses course) throws Exception {

		Courses[] courses = { new Courses("1", 100, "Yazýlým Geliþtirici Yetiþtirme Kampý (JavaScript)",
				"1,5 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.",
				"jsBanner.jpg"),
				new Courses("2", 150, "Programlamaya Giriþ Ýçin Temel Kurs",
						"PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr örneklerle öðrenin.",
						"programlamayaGiris.jpg"),
				new Courses("3", 200, "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA & REACT)",
						"2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.",
						"javaReactBanner.jpg") };
		
		for (Courses course1 : courses) {
			if(course.getName().equals(course1)) {
				throw new Exception("Course names is cannot be repeated.");
			}
			else if(course.getPrice()<0) {
				throw new Exception("Course price cannot be less than zero ");
			}
		}
		
		courseDao.add(course);
		for (ILogger logger : loggers) {
			logger.log("Course saved. ");
		}
		
	}
	
	
	
	
	

}
