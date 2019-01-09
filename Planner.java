import java.io.FileNotFoundException;
import java.util.Scanner;

public class Planner {

	public static void main(String[] args) throws FileNotFoundException {


	PlanOfStudy pos = new PlanOfStudy();

	Degree d;


	System.out.println("1. Load CSV file or prompt them to load in their own csv file");
	System.out.println("2. Go to degree option menu");
	System.out.println("3. Add courses to my POS and mark them as completed/in-progress/planned");
	System.out.println("4. Mark your courses in your POS as required, elective, or minor");
	System.out.println("5. Remove a course from my POS");
	System.out.println("6. Change my grade for a course that is in my POS");
	System.out.println("7. Save my POS to a file");
	System.out.println("8. Load my previous POS file");
	System.out.println("9. View a list of required courses for my degree and major that are not represented in my POS");
	System.out.println("10. View a list of the pre-requirisites courses for any required courses for my degree and major");
	System.out.println("11. View the number of credits I have completed in my POS");
	System.out.println("12. View the number of credits I have remaining to completed my POS");
	System.out.println("13. Let the program determine if you have met the completion required of my chosen degree");
	System.out.println("14. Quit the program");
	System.out.println("These are the transactions available\n");

	Scanner scanDecision = new Scanner(System.in);

	int userDecision = scanDecision.nextInt();

	while(scanDecision.hasNextLine()) {

	if (userDecision == 2) {
		Scanner scanner = new Scanner(System.in);
		String courseCode = new String();
		String courseSem = new String();

		System.out.println("Please select your degree: ");

		System.out.println("Enter 1 for BCH, 2 for BCG ");
		userDecision = scanner.nextInt();

		if (userDecision == 1) {

			System.out.println("Enter 1 for CS, 2 for SEng ");
			userDecision = scanner.nextInt();

			if (userDecision == 1) {

				d = new CS(null, null);
				pos.setDegreeProgram(d);

			}


			if (userDecision == 2) {

				d = new SEng(null, null);
				pos.setDegreeProgram(d);


			}

			System.out.println("Please enter the semester: ");
			courseSem = scanner.next();

			pos.addCourse(courseCode, courseSem);


		}

		else if (userDecision == 2) {

			d = new BCG(null, null);
			pos.setDegreeProgram(d);

			System.out.println("Please enter the semester: ");
			courseSem = scanner.next();

			pos.addCourse(courseCode, courseSem);

		}




	}


	if (userDecision == 3) {
		Scanner scanner = new Scanner(System.in);
		String courseCode = new String();
		String courseSem = new String();

		System.out.println("Please enter the course code: ");
		courseCode = scanner.nextLine();

		System.out.println("Please enter the semester: ");
		courseSem = scanner.nextLine();

		pos.addCourse(courseCode, courseSem);


	}

	if (userDecision == 4) {
		Scanner scanner = new Scanner(System.in);
		String courseCode = new String();
		String courseSem = new String();
		String courseStatus = new String();

		System.out.println("Please enter the course code: ");
		courseCode = scanner.nextLine();

		System.out.println("Please enter the semester: ");
		courseSem = scanner.nextLine();

		System.out.println("Please enter the status: ");
		courseStatus = scanner.nextLine();

		pos.setCourseStatus(courseCode, courseSem, courseStatus);


	}

	if (userDecision == 5) {
		Scanner scanner = new Scanner(System.in);
		String courseCode = new String();
		String courseSem = new String();

		System.out.println("Please enter the course code: ");
		courseCode = scanner.nextLine();

		System.out.println("Please enter the semester: ");
		courseSem = scanner.nextLine();

		pos.removeCourse(courseCode, courseSem);


	}


	if (userDecision == 6) {
		Scanner scanner = new Scanner(System.in);
		String courseCode = new String();
		String courseSem = new String();
		String courseGrade = new String();

		System.out.println("Please enter the course code: ");
		courseCode = scanner.nextLine();

		System.out.println("Please enter the semester: ");
		courseSem = scanner.nextLine();

		pos.setCourseGrade(courseCode, courseSem, courseGrade);


	}

		if (userDecision == 14) {

			System.exit(0);

		}

	System.out.println("1. Load CSV file or prompt them to load in their own csv file");
	System.out.println("2. Go to degree option menu");
	System.out.println("3. Add courses to my POS and mark them as completed/in-progress/planned");
	System.out.println("4. Mark your courses in your POS as required, elective, or minor");
	System.out.println("5. Remove a course from my POS");
	System.out.println("6. Change my grade for a course that is in my POS");
	System.out.println("7. Save my POS to a file");
	System.out.println("8. Load my previous POS file");
	System.out.println("9. View a list of required courses for my degree and major that are not represented in my POS");
	System.out.println("10. View a list of the pre-requirisites courses for any required courses for my degree and major");
	System.out.println("11. View the number of credits I have completed in my POS");
	System.out.println("12. View the number of credits I have remaining to completed my POS");
	System.out.println("13. Let the program determine if you have met the completion required of my chosen degree");
	System.out.println("14. Quit the program");
	System.out.println("These are the transactions available\n");

	userDecision = scanDecision.nextInt();

	}

	scanDecision.close();


	}

}
