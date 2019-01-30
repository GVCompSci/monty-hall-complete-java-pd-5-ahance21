import java.util.Random;
import java.util.Scanner;

public class MontyHall3 {

	public static void main(String[] args) 
	
	{
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		
		int door1 = rand.nextInt(3) + 1;
		int win = 0;
		System.out.print("Please enter the number of times you would like to roll ");
		String rollStr = keyboard.nextLine();
		int roll = Integer.parseInt(rollStr);
		{
			if (roll < 10 || roll > 10000)
			System.out.print("Enter a nuber between 10 and 10000 ");
		}
	    	if (roll >= 10 || roll <= 10000)
	    	System.out.print("Would you like to switch doors? ");
	    	String doorswitch = keyboard.nextLine();
            { 
        
            if (doorswitch.equals("no"))
            for(int i =0; i < roll; i++)
            {
            	int carDoor1 = rand.nextInt(3) + 1;
                if (door1 == carDoor1) {
                win++;
                System.out.print("\nYou won " + win);
            }
            }
        
        }   
            if (doorswitch.equals("yes"))
            for (int i =0; i < roll; i++)
        {       
            int door2 = rand.nextInt(3) + 1;
            int carDoor2 = rand.nextInt(3) + 1;
            if (door2 == carDoor2) {
            win++;   
            System.out.print("\nYou won " + win);
           }
       
      
        }
	}
}
