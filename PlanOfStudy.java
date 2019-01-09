import java.util.ArrayList;

public class PlanOfStudy {

	
	ArrayList<Course> myCourses = new ArrayList<Course>();
	

void setDegreeProgram(Degree deg) {

	deg.setDegreeTitle("CS");
	
}

Degree getDegreeProgram() {
	return null;

}

void importData(String filename) {

}

void saveState() {


}

void addCourse(String courseCode, String semester) {

	Course c = new Course();
	
	c.setCourseCode(courseCode);
	c.setSemesterTaken(semester);
	
	myCourses.add(c);
	
}

void removeCourse(String courseCode, String semester) {
	
	int size = myCourses.size();
	
		for (int x = 0; x<size; ++x) {
			
			 if (courseCode.equals(myCourses.get(x).getCourseCode())) {
				 myCourses.remove(x);

		}
	}

}

void setCourseStatus(String courseCode, String semester, String courseStatus) {

	int size = myCourses.size();
	
	for (int x = 0; x<size; ++x) {
		
		 if (courseCode.equals(myCourses.get(x).getCourseCode())) {
			 myCourses.get(x).setCourseCode(courseCode);
			 myCourses.get(x).setSemesterTaken(semester);
			 myCourses.get(x).setCourseStatus(courseStatus);

	}
}
	
}

void setCourseGrade(String courseCode, String semester, String grade) {

	
}

Course getCourse(String courseCode, String semester) {
	return null;

}



}
