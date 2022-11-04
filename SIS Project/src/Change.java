import java.util.Scanner;

public class Change 
{
	public static void main(String[] args)
	{
		Scanner name = new Scanner(System.in);
		
		System.out.println("Add or Delete a Student");
		System.out.println("    (1) Add a Student");
		System.out.println("    (2) Delete a Student");
		System.out.println("    (3) Return to the Main Menu");
		
		int input = name.nextInt();
		
		if(input == 1)
		{
			System.out.println("What is the first and last name of the student you would like to add?");
			String wholeName = name.nextLine();
		}
		else if(input == 2)
		{
			System.out.println("What is the first name of the student you would like to delete?");
			String wholeName = name.nextLine();
		}
		else
		{
			//return them to the main menu
		}
			
	}
	
}
