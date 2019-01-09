import java.util.ArrayList;

public abstract class Degree{

	@SuppressWarnings("unused")
	private String courseCode;
	private String degtitle;
	private ArrayList<Course> requiredCourses;
	@SuppressWarnings("unused")
	private CourseCatalog cc;

		
	public Degree(String code, CourseCatalog cat)
	{	
		
		cc = cat;
		courseCode = code;
		degtitle = null;
		requiredCourses = new ArrayList<Course>();
		
	}


	
public Degree(String title, ArrayList<String> listOfRequiredCourses){
	
	setDegreeTitle(title);
	setRequiredCourses(listOfRequiredCourses);
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


