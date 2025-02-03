import java.util.Scanner;
 
public class HMSConverter 
{
   	public static void main(String[] args)
   	{
		Scanner scnr = new Scanner(System.in);
		int numHours;
        int numMinutes;
        int numSeconds;
		int totalSeconds;

		System.out.println("Enter the number of hours:");
		numHours = scnr.nextInt();

        System.out.println("Enter the number of minutes:");
		numMinutes = scnr.nextInt();

        System.out.println("Enter the number of seconds:");
		numSeconds = scnr.nextInt();

        totalSeconds = (numHours * 3600) + (numMinutes * 60) + numSeconds;

		System.out.println("Total seconds: " + totalSeconds);
   	}
}

