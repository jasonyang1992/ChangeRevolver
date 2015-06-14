import java.util.*;
public class ChangeRevolver {

	public static void main(String[] args)
	{
		String Program;
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.println("Welcome to Change Revolver");
		System.out.println("Type in ChangeMaker if you want to use ChangeMaker with no spaces");
		System.out.println("Type in MakeChange if you want to use MakeChange with no spaces");
		System.out.println("------------------------------------------------------------------------------------------------------------");
		Scanner program = new Scanner(System.in);
		Program=program.next() .toUpperCase();
		
		if (Program.equals("CHANGEMAKER"))
		{
			// execute Change maker
			ChangeMaker.main(args);
			
		}
		else if (Program.equals("MAKECHANGE"))
		{
			// execute Make change
			MakeChange.main(args);
			
		}
		else
		{
			// user error, return back to change revolver
			System.out.println("You have choosen something that is not of the options, please try again");
			ChangeRevolver.main(args);
			
		}
	}
}

