import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class CourseCatalog implements Serializable {


/**
	 *
	 */
	private static final long serialVersionUID = 1L;
ArrayList<Course> availableCourses = new ArrayList<Course>();
ArrayList<String> PQ = new ArrayList<String>();
ArrayList<Course> reqCourses = new ArrayList<Course>();

int i = 0;
private ObjectOutputStream objectOutputStream;

/**
*
* This functino is used to parse each line
* and stores it in an array, then stores it in
* a course object. finally it adds that course
* object to a course arraylist.
*
* @author  Ishan Ruchal
* @version 1.0
* @since   2018
*/
void initializeCatalog(String filename) {

	File file = new File(filename);
	 try
        {
        	Scanner fileLine = new Scanner(file);


	 while (fileLine.hasNextLine()) {

		 		Course course = new Course();
                String line = fileLine.nextLine();


                String[] lineString = line.split(",");
                int lsLength = lineString.length;

                if (lineString[0].equals("") || lineString[0].equals(" ") || lineString[1].equals("") || lineString[1].equals(" ") ||lineString[2].equals("") || lineString[2].equals(" ")){
                	System.out.println("Empty field in file");

                }

                else {
                course.setCourseCode(lineString[0]);
                course.setCourseCredit(Double.parseDouble(lineString[1]));
                course.setCourseTitle(lineString[2]);
                if (lsLength == 4) {
                if (lineString[3] != null) {

                	PQ.add(lineString[3]);

                }

                }

                else {
                	PQ.add("NULL");
                }
                availableCourses.add(course);


       }
	 }
	 fileLine.close();
        }
        catch(IOException e)
        {

        	return;
        }

}

/**
*
* This functino is used to parse each line
* and stores it in an array, then stores it in
* a course object. finally it adds that course
* object to a course arraylist.
*
* Same functionality as above but executes import junit.framework.TestCase;
* for required array list instead.
*/
void initializeReqCatalog(String filename) {

	File file = new File(filename);
	 try
        {
		 reqCourses = new ArrayList<Course>();

		String bcgFile = new String();
		String csFile = new String();
		String seFile = new String();

		String BCG = "BCG";
		String CS = "CS";


		bcgFile = "bcgReq.txt";
		csFile = "csReq.txt";
		seFile = "seReq.txt";

		if (filename.equals(bcgFile)){
			Scanner fileLine = new Scanner(file);

			while (fileLine.hasNextLine()) {
				String line = fileLine.nextLine();
             System.out.println(line);

             String[] lineString = line.split(",");
             int length = lineString.length;
             if (lineString[0].equals(BCG)) {
             	int i = 1;
             	System.out.println("This is the contents of required array list: ");
             	 while(i<length) {
                  	Course course = new Course();
                  	System.out.println(lineString[i]);
                  	course.setCourseCode(lineString[i]);
                      course.setCourseCredit(0);
                      course.setCourseTitle(null);
                      reqCourses.add(course);

                      ++i;

                  }

             	 return;
             }

             else {

             	System.out.println("Unable to locate Degree");
             	return;
             	}


             }
			fileLine.close();
			}


	 else if (filename.equals(csFile)){
			Scanner fileLine = new Scanner(file);

			while (fileLine.hasNextLine()) {
				String line = fileLine.nextLine();
             System.out.println(line);

             String[] lineString = line.split(",");
             int length = lineString.length;
             if (lineString[0].equals(CS)) {
             	int i = 1;
             	System.out.println("This is the contents of required array list: ");
             	 while(i<length) {
                  	Course course = new Course();
                  	System.out.println(lineString[i]);
                  	course.setCourseCode(lineString[i]);
                      course.setCourseCredit(0);
                      course.setCourseTitle(null);
                      reqCourses.add(course);

                      ++i;

                  }

             	 return;
             }

             else {

             	System.out.println("Unable to locate Degree");
             	return;
             	}


             }
			fileLine.close();
			}

	 else if (filename.equals(seFile)){
			Scanner fileLine = new Scanner(file);

			while (fileLine.hasNextLine()) {
				String line = fileLine.nextLine();
          System.out.println(line);

          String[] lineString = line.split(",");
          int length = lineString.length;
          if (lineString[0].equals("SE")) {
          	int i = 1;
          	System.out.println("This is the contents of required array list: ");
          	 while(i<length) {
               	Course course = new Course();
               	System.out.println(lineString[i]);
               	course.setCourseCode(lineString[i]);
                   course.setCourseCredit(0);
                   course.setCourseTitle(null);
                   reqCourses.add(course);

                   ++i;

               }

          	 return;
          }

          else {

          	System.out.println("Unable to locate Degree");
          	return;
          	}


          }
			fileLine.close();
			}


		}


        catch(IOException e)
        {
        // work with the errors here
        }


}


void addCourse(Course toAdd) {

}

void removeCourse(Course toRemove) {

}

void saveCatalog() throws IOException {

	try {
	FileOutputStream fileOutputStream = new FileOutputStream("savedCatalogue");
	objectOutputStream = new ObjectOutputStream(fileOutputStream);

	for(Course z: reqCourses) {

	objectOutputStream.writeObject(z);

	}



	}	catch(IOException i){
		i.printStackTrace();
	}



}

/**
*
* This function is used to find the course
* in available arraylist and store it in
* the required array list.
*
*/
Course findCourse(String courseCode){
	int size = reqCourses.size();

	for (Course temp: availableCourses) {

		  if (temp.getCourseCode().equals(courseCode)) {
			Course reqCourse = new Course();
			reqCourse.setCourseCode(temp.getCourseCode());
			reqCourse.setCourseCredit(temp.getCourseCredit());
			reqCourse.setCourseTitle(temp.getCourseTitle());
			reqCourse.setPrerequisites(((temp.getPrerequisites())));

			for (int x = 0; x<size; ++x) {
				 if (reqCourse.getCourseCode().equals(reqCourses.get(x).getCourseCode())) {
					 reqCourses.get(x).setCourseCode(reqCourse.getCourseCode());
					 reqCourses.get(x).setCourseCredit(reqCourse.getCourseCredit());
					 reqCourses.get(x).setCourseTitle(reqCourse.getCourseTitle());
					 reqCourses.get(x).setPrerequisites(reqCourse.getPrerequisites());

				 }
			}


			return reqCourse;

	}

	}
	System.out.println("Course not found:");
	return null;

}

int getRequiredSize(){
	int size = reqCourses.size();

	return size;

}

String getRequiredCourse(int index){

	String courseCode = new String();
	Course reqCourse = new Course();
	reqCourse = reqCourses.get(index);
	courseCode = reqCourse.getCourseCode();

	return courseCode;

}


/**
*
* This functino is used to print the
* available arraylist.
*
*
*/
void PrintAvailableAL(){

	System.out.println("Here are the the contents of the Available Array List");
	for (Course i: availableCourses) {


		System.out.println("Course Code: " + i.getCourseCode());
		System.out.println("Course Credit: " + i.getCourseCredit());
		System.out.println("Course Title: " + i.getCourseTitle());

		if(i.getPrerequisites().size() == 0){
			System.out.println("Course Prerequisites: None ");
		}

		for (Course x: i.getPrerequisites()) {
			if  (i.getPrerequisites() == null) {
				System.out.println("Course Prerequisites: None ");
			}
			else {
			System.out.println("Course Prerequisites: " + x.getCourseCode());
		}
	}
	}

	}

	/**
	*
	* This functino is used to print the
	* required array list.
	*
	*/
void PrintReqAL(){

	System.out.println("Here are the the contents of the Required Array List");

	for (Course i: reqCourses) {

		System.out.println("Course Code: " + i.getCourseCode());
		System.out.println("Course Credit: " + i.getCourseCredit());
		System.out.println("Course Title: " + i.getCourseTitle());
		if(i.getPrerequisites().size() == 0){
			System.out.println("Course Prerequisites: None ");
		}

		for (Course x: i.getPrerequisites()) {
			if  (i.getPrerequisites() == null) {
				System.out.println("Course Prerequisites: None ");
			}
			else {
			System.out.println("Course Prerequisites: " + x.getCourseCode());
		}


		}
	}
	}

void PrintPreReq(){

	System.out.println("Here are the the contents of the Pre REQ Array List");

	for (Course i: availableCourses) {
		ArrayList<Course> tester = i.getPrerequisites();
		for (Course p: tester) {
			System.out.println("Course Code: " + p.getCourseCode());
			System.out.println("Course Credit: " + p.getCourseCredit());
			System.out.println("Course Title: " + p.getCourseTitle());
		}


	}

	}

	/**
	*
	* the preRequisites of each course object in the available
	*arraylist is initialized here.
	*/
void checkPreRequisites(){

	int alSize = availableCourses.size();


	 for (int i = 0; i<alSize; ++i) {
		 ArrayList<Course> preReqList = new ArrayList<Course>();


		if (PQ.get(i).equals("NULL")) {
			availableCourses.get(0).setPrerequisites(null);

		}

		else {

			String[] lineString = PQ.get(i).split(":");

            int lsLength = lineString.length;
            int x = 0;
            while (x<lsLength){
            	Course temp = new Course();
            	temp.setCourseCode(lineString[x]);

            	for (Course a: availableCourses) {

          		  if (a.getCourseCode().equals(temp.getCourseCode())) {

          			temp.setCourseCode(a.getCourseCode());
          			temp.setCourseCredit(a.getCourseCredit());
          			temp.setCourseTitle(a.getCourseTitle());
          			temp.setPrerequisites(null);
          			preReqList.add(temp);
          			break;
          		  }




            }

            	++x;
		}
            availableCourses.get(i).setPrerequisites(preReqList);

	 }

	}



}

}
