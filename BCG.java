import java.util.ArrayList;

public class BCG extends GeneralDegree {

	public BCG(String title, ArrayList<String> listOfRequiredCourses) {
		super(title, listOfRequiredCourses);
		// TODO Auto-generated constructor stub
	}


	String degTitle = new String();
	ArrayList<Course> requiredCourses = new ArrayList<Course>();


String getDegreeTitle() {

	return degTitle;
}


void setDegreeTitle(String title) {
	
	degTitle = title;
	
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