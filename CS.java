import java.util.ArrayList;

public class CS extends HonoursDegree{


	private String degtitle;
	private ArrayList<Course> requiredCourses;


public CS(String title, ArrayList<String> listOfRequiredCourses) {
		super(title, listOfRequiredCourses);
		// TODO Auto-generated constructor stub
	}


String getDegreeTitle() {
	return degtitle;

}


void setDegreeTitle(String title) {

}

void setRequiredCourses(ArrayList<String> listOfRequiredCourseCodes) {

}


ArrayList<Course> getRequiredCourses() {
	return requiredCourses;

}

boolean meetsRequirements(PlanOfStudy thePlan) {
	return false;

}


double numberOfCreditsRemaining(PlanOfStudy thePlan) {
	return 0;

}


ArrayList<Course> remainingRequiredCourses(PlanOfStudy thePlan) {
	return requiredCourses;

}


}