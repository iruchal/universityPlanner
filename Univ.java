import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.Serializable;
import java.io.File;

public class Univ implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CourseCatalog cat;
	private ArrayList<Degree> degrees;
	public Univ()
	{
		degrees = new ArrayList<>();
		new PlanOfStudy();
		cat = new CourseCatalog();
	}
	
	public void initializeCat(String filename)
	{
		cat.initializeCatalog(filename);
	}
	
	public void addNewDegree(String filename) {

		File file = new File(filename);
	 try
        {
        	Scanner fileLine = new Scanner(file);


	 while (fileLine.hasNextLine()) {
		 		Degree d = null;	
		 		ArrayList<String>requiredCourses = new ArrayList<String>();

               	
			
			while (fileLine.hasNextLine()) {
				String line = fileLine.nextLine();
             System.out.println(line);

             String[] lineString = line.split(",");
             if (lineString[0].equals("BCG")) {
            	 d = new BCG(null, null);
             }
             
             else if (lineString[0].equals("CS")) {
            	  d = new CS(null, null);
             }
             
             else if (lineString[0].equals("SEng")) {
            	 d = new SEng(null, null);
             }
             
             int length = lineString.length;
           
             	int i = 1;
             	 while(i<length) {
                  	requiredCourses.add(lineString[i]);
                     ++i;
                  }
                         
	 	}
			
			d.setRequiredCourses(requiredCourses);
			degrees.add(d);


			fileLine.close();
     }

        }
        catch(IOException e)
        {
       
        	return;
        }
      

				
	}
	 
	 
	
	public void writeToDisk()
	{
		try
		{
		ObjectOutputStream s = new ObjectOutputStream(new FileOutputStream("mysavefile.sav"));
		s.writeObject(this);
		s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	public String toString()
	{
		return("Univ demo"+ degrees.get(0).toString());
	}
	
	
	

}