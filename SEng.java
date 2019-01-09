import java.util.ArrayList;

public class SEng extends HonoursDegree{
	
	private String degtitle;
	public SEng(String title, ArrayList<String> listOfRequiredCourses) {
		super(title, listOfRequiredCourses);
		// TODO Auto-generated constructor stub
	}


	
String getDegreeTitle() {
	return degtitle;
}


void setDegreeTitle(String title) {
	degtitle = title;
}

void setRequiredCourses(ArrayList<String> listOfRequiredCourseCodes) {
}


ArrayList<Course> getRequiredCourses() {
	return null;

}

boolean meetsRequirements(PlanOfStudy thePlan) {
	return false;

}


double numberOfCreditsRemaining(PlanOfStudy thePlan) {
	return 0;

}


ArrayList<Course> remainingRequiredCourses(PlanOfStudy thePlan) {
	return null;
	
}


}