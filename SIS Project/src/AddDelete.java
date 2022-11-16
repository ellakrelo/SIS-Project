import java.util.Scanner;

public class AddDelete 
{
	public static void main(String[] args)
	{
		Scanner name = new Scanner(System.in);
		
		System.out.println("Add or Delete a Student");
		System.out.println("(1) Add a Student");
		System.out.println("(2) Delete a Student");
		System.out.println("(3) Return to the Main Menu");
		
		int input = name.nextInt();
		
		if(input == 1)
		{
			System.out.println("What is the first name of the student you would like to add?");
			String firstName = name.nextLine();
			System.out.println("What is the last name of the student you would like to add?");
			String lastName = name.nextLine();
			System.out.println("What is the first class of the student you would like to add?");
			String firstClass = name.nextLine();
			System.out.println("What is the student's grade in this class?");
			String firstGrade = name.nextLine();
			System.out.println("What is the second class of the student you would like to add?");
			String secondClass = name.nextLine();
			System.out.println("What is the student's grade in this class?");
			String secondGrade = name.nextLine();
			System.out.println("What is the third class of the student you would like to add?");
			String thirdClass = name.nextLine();
			System.out.println("What is the student's grade in this class?");
			String thirdGrade = name.nextLine();
			
			Roster.roster.add(new Student(firstName, lastName, 0.00, firstClass, firstGrade, secondClass, secondGrade, thirdClass, thirdGrade));
		}
		else if(input == 2)
		{
			System.out.println("What is the first name of the student you would like to delete?");
			String firstName = name.nextLine();
			System.out.println("What is the last name of the student you would like to delete?");
			String lastName = name.nextLine();
			
				for(int i = 0; i< Roster.roster.size(); i++)
				{
					if(firstName.equals(Roster.roster.get(i).getFirstName()) && lastName.equals(Roster.roster.get(i).getLastName()))
					{
						Roster.roster.remove(i);
					}
				}
		}
		else
		{
			
		}
		
			
	}
	
}
