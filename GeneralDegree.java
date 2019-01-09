import java.util.ArrayList;

public abstract class GeneralDegree extends Degree{
	
	@SuppressWarnings("unused")
	private String courseCode;
	private String degtitle;
	private ArrayList<Course> requiredCourses;
	@SuppressWarnings("unused")
	private CourseCatalog cc;

	public GeneralDegree(String title, ArrayList<String> listOfRequiredCourses) {
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
	return null;

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