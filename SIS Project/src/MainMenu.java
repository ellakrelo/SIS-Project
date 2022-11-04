import java.util.Scanner;

public class MainMenu
	{
		static Scanner userIntInput = new Scanner(System.in);
		static int input = 0;
		static Scanner userStringInput = new Scanner(System.in);
		static String pause = "";
		
		public static void main(String[] args)
			{
				System.out.println("Welcome to the student information system! Press enter to continue.");
				pause = userIntInput.nextLine();
				mainMenu();
			}
		
		public static void mainMenu()
			{
				System.out.println("What would you like to do next?\n (1) List Students\n (2) Add or Delete a Student\n (3) Change Grades/Schedule\n (4) Sort Students");
				input = userIntInput.nextInt();
				
			}
	}
