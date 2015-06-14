import java.util.Scanner;
public class ChangeMaker {

	public static void main(String[] args)
	{
	// variables for coins
	int quarters=25;
	int dimes=10;
	int nickels=5;
	int pennies=1;
	// # of coins the user as enter
	int quarteramount;
	int nickelamount;
	int dimeamount;
	int pennyamount;
	// Ending value
	double endamount;
	System.out.println("------------------------------------------------------------------------------------------------------------");
	Greeting();
	// User input number of coins they have
		quarteramount=Quarters();
		dimeamount=Dimes();
		nickelamount=Nickels();
		pennyamount=Pennies();
	// The final calculation
	endamount=Calculation(quarteramount, dimeamount, nickelamount,
			pennyamount, quarters, dimes, nickels, pennies);
	System.out.println("Your total is " +endamount);
	System.out.println("Thank you!");
	ChangeRevolver.main(args);
	
	}
	public static void Greeting()
	{
		System.out.println("Welcome to Change Maker");
	}
	public static int Quarters() // # of quarters
	{
		Scanner in = new Scanner(System.in);
		System.out.println("How many quarters do you have?");
		int quarter; // quarter = number of quarters the user as enter
		quarter=in.nextInt();
		System.out.println("Your total for quarters is " +quarter*25);
		System.out.println("------------------------------------------------------------------------------------------------------------");
		return quarter;
		
	}
	public static int Dimes() // # of dimes
	{
		Scanner in = new Scanner(System.in);
		System.out.println("How many dimes do you have?");
		int dimes; // dimes = number of dimes the user as enter
		dimes=in.nextInt();
		System.out.println("Your total for dimes is " +dimes*10);
		System.out.println("------------------------------------------------------------------------------------------------------------");
		return dimes;
		
	}
	public static int Nickels() // # of nickels
	{
		Scanner in = new Scanner(System.in);
		System.out.println("How many nickels do you have?");
		int nickels; // nickels = number of nickels the user as enter
		nickels=in.nextInt();
		System.out.println("Your total for nickels is " +nickels*5);
		System.out.println("------------------------------------------------------------------------------------------------------------");
		return nickels;
		
	}
	public static int Pennies() // # of pennies
	{
		Scanner in = new Scanner(System.in);
		System.out.println("How many pennies do you have?");
		int pennies; // pennies = number of pennies the user as enter
		pennies=in.nextInt();
		System.out.println("Your total for pennies is " +pennies*1);
		System.out.println("------------------------------------------------------------------------------------------------------------");
		return pennies;
		
	}
	// Calculation
	public static double Calculation( int quarteramount, int dimeamount,
			int nickelamount, int pennyamount, int quarters, 
			int dimes, int nickels, int pennies)
	{
		int Total;
		Total=((quarteramount*quarters)+
				(dimeamount*dimes)+
				(nickelamount*nickels)+
				(pennyamount*pennies));
		return Total;
	}
}
