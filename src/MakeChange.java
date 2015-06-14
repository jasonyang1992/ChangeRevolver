import java.util.Scanner;
public class MakeChange {
/*
 * Jason Yang
 * CIS 4160
 */
	public static void main(String[] args)
	{
	Scanner in = new Scanner(System.in);
		// coins = user input
		int coins; 
		
		// variable for each coin
		int quarters  ;
		int dimes  ;
		int nickels  ;
		int pennies ;

	System.out.println("------------------------------------------------------------------------------------------------------------");
	System.out.println("Please enter the sum of money in cent");
	coins=in.nextInt();
	
	//Calculations
	quarters = coins/25;
	dimes = (coins - quarters*25)/10;
	nickels = ((coins - (quarters*25))-(dimes*10 ))/5;
	pennies = (((coins - quarters*25)-(dimes*10 ))-(nickels*5))/1;
	
	//User output
	System.out.println("quarters = " +quarters);
	System.out.println("dimes = " +dimes);
	System.out.println("nickels = " +nickels);
	System.out.println("pennies = " +pennies);
	System.out.println("Thank you!");
	ChangeRevolver.main(args);
	}
}
