import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;



public class Bootstrap {

	/**
	*
	* This program is a starter for loading the csv files
	* and stores them in two arrayLists available and required.
	* It saves the required courses in a serialized file.
	*
	* @author  Ishan Ruchal
	* @version 1.0
	* @since   2018-10-28
	*/
	public static void main(String[] args) throws FileNotFoundException {
		Univ uni = new Univ();
		CourseCatalog cc = new CourseCatalog();
		String fileName = new String();

		System.out.println("These are the transactions available\n");
		System.out.println("1. Load a list of available courses from a CSV file");
		System.out.println("2. Load a list of the required courses for a degree from CSV file");
		System.out.println("3. Save the current representation of course and degree information to a file");



		Scanner scanDecision = new Scanner(System.in);

		int userDecision = scanDecision.nextInt();

		while(scanDecision.hasNextLine()) {

		if(userDecision == 1) {

			fileName = "availableCourses";
			cc.initializeCatalog(fileName);

			cc.checkPreRequisites();
			cc.PrintAvailableAL();
			uni.initializeCat(fileName);

		}

		if(userDecision == 2) {


			System.out.println("There are three degrees, BCG, CS, SE, please enter one of them:");
			String BCG = "BCG";
			String CS = "CS";
			String SE = "SE";

			String degDecision = new String();
			degDecision = scanDecision.next();

			if (degDecision.equals(BCG)){

				fileName = "bcgReq.txt";
			}

			else if (degDecision.equals(CS)){
				fileName = "csReq.txt";
			}

			else if (degDecision.equals(SE)){
				fileName = "seReq.txt";
			}


			cc.initializeReqCatalog(fileName);
			int size = cc.getRequiredSize();
			int i = 0;
			/**
			*
			* Loops through the required course arraylist
			* Finds course in available array list and
			* imports the fields and sets them in corresponding
			* required array list object
			* @author  Ishan Ruchal
			* @version 1.0
			* @since   2018-10-28
			*/
			while(i<size) {
				String courseCode = cc.getRequiredCourse(i);
				cc.findCourse(courseCode);
				++i;
			}
			cc.PrintReqAL();


		}

		if(userDecision == 3) {

			try {
				cc.saveCatalog();
				uni.writeToDisk();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		System.out.println("These are the transactions available\n");
		System.out.println("1. Load a list of available courses from a CSV file");
		System.out.println("2. Load a list of the required courses for a degree from CSV file");
		System.out.println("3. Save the current representation of course and degree information to a file");

		userDecision = scanDecision.nextInt();


	}
		scanDecision.close();
}

}
