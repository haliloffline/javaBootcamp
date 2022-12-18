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

		Courses[] courses = { new Courses("1", 100, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JavaScript)",
				"1,5 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.",
				"jsBanner.jpg"),
				new Courses("2", 150, "Programlamaya Giri� ��in Temel Kurs",
						"PYTHON, JAVA, C# gibi t�m programlama dilleri i�in temel programlama mant���n� anla��l�r �rneklerle ��renin.",
						"programlamayaGiris.jpg"),
				new Courses("3", 200, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA & REACT)",
						"2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.",
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
