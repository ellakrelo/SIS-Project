import java.io.IOException;
import java.util.Scanner;

public class MainMenu
	{
		static Scanner userIntInput = new Scanner(System.in);
		static int input = 0;
		static Scanner userStringInput = new Scanner(System.in);
		static String pause = "";
		
		public static void main(String[] args) throws IOException
			{
				System.out.println("Welcome to the student information system! Press enter to continue.");
				pause = userIntInput.nextLine();
				mainMenu();
			}
		
		public static void mainMenu() throws IOException
			{
				Roster.fillRoster();
				
				System.out.println("What would you like to do next?\n (1) List Students\n (2) Add or Delete a Student\n (3) Change Grades/Schedule\n (4) Sort Students");
				input = userIntInput.nextInt();
				
				if(input == 1)
					{
						Roster.listRoster();
						mainMenu();
					}
				else if(input == 2)
					{
						AddDelete.main(null);
						System.out.println("Please press enter to return to the main menu.");
						pause = userIntInput.nextLine();
						mainMenu();
					}
				else if(input == 3)
					{
						//Grades/Schedule
						System.out.println("Please press enter to return to the main menu.");
						pause = userIntInput.nextLine();
						mainMenu();
					}
				else if(input == 4)
					{
						System.out.println("How would you like to sort the students?\n (1) Sort Students by Last Name\n (2) Sort Students by GPA\n (3) Sort Students by Period");
						input = userIntInput.nextInt();
						
							if(input == 1)
								{
									//SortLastname.compare();
									Roster.listRoster();
								}
							else if(input == 2)
								{
									//SortGPA.compare();
									Roster.listRoster();
								}
							else if(input == 3)
								{
									//SortPeriod.compare();
									Roster.listRoster();
								}
							else
								{
									System.out.println("I'm sorry, that is not an option. Please try again.\n");
									mainMenu();
								}
							
						System.out.println("Please press enter to return to the main menu.");
						pause = userIntInput.nextLine();
						mainMenu();
					}
				else
					{
						System.out.println("I'm sorry, that is not an option. Please try again.\n");
						mainMenu();
					}
			}
	}
