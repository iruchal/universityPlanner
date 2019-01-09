import java.io.Serializable;
import java.util.ArrayList;

public class Course implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	String cCode = new String();
	double cWeight;
	String cName = new String();
	String cGrade = new String();
	String cSemester = new String();
	ArrayList<Course> preRequisiteList = new ArrayList<Course>();




public String getCourseCode(){
	return cCode;

}

public void setCourseCode(String courseCode){
	cCode = courseCode;
}

public String getCourseTitle(){
	return cName;

}

public void setCourseTitle(String courseTitle){
	cName = courseTitle;
}

public double getCourseCredit(){
	return cWeight;

}

public void setCourseCredit(double credit){

	cWeight = credit;
}

public ArrayList<Course> getPrerequisites(){
	return preRequisiteList;


}

/**
*
* Loops through the preReqList and
* sets the corresponding fields and
* adds it to the class's global version
* of the required array list.
* @author  Ishan Ruchal
* @version 1.0
* @since   2014-03-31
*/
void setPrerequisites (ArrayList<Course> preReqList){

	if (preReqList != null){
 	for (Course i: preReqList) {
 		Course c = new Course();
 		c.setCourseCode(i.getCourseCode());
 		c.setCourseCredit(i.getCourseCredit());
 		c.setCourseTitle(i.getCourseTitle());
 		c.setPrerequisites(i.getPrerequisites());

 		preRequisiteList.add(c);
 	}
	}

	if (preReqList == null) {


	}
}

public void setCourseStatus(String courseStatus){


}

public String getCourseStatus(){
	return null;


}

public void setCourseGrade(String grade){

	cGrade = grade;

}

public String getCourseGrade(){
	return cGrade;


}

public void setSemesterTaken(String semester){

	cSemester = semester;
}

public String getSemesterTaken(){
	return cSemester;

}

}
