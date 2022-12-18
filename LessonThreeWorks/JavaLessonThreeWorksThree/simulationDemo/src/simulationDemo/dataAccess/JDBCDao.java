package simulationDemo.dataAccess;

import simulationDemo.entities.Category;
import simulationDemo.entities.Courses;
import simulationDemo.entities.Educator;

public class JDBCDao implements ICategoryDao,ICoursesDao,IEducatorDao{

	@Override
	public void add(Educator educator) {
		System.out.println("Added Educator with JDBBC : "+educator.getFirstName()+" "+educator.getLastName());
	}
	
	@Override
	public void add(Courses courses) {
		System.out.println("Added course with JDBBC : "+courses.getName());
		
	}

	@Override
	public void add(Category category) {
		System.out.println("Added category with JDBBC : "+category.getName());
		
	}


}
