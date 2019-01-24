import java.util.Random;
import java.util.Scanner;

public class MontyHall
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		String bread = keyboard.nextLine();
		Random rand = new Random();
		
		
		
		int carDoor = rand.nextInt(3) + 1;
		int carDoor1 = rand.nextInt(2) + 1;
		int carDoor2 = rand.nextInt(3) + 2;
		
		System.out.print("Please guess which car the door is behind");
		String doorStr = keyboard.nextLine();
		int door = Integer.parseInt(doorStr);
		String doorswitch;
		if (door<1 || door>3)
		{
			System.out.print("The door number is invalid ");
		}
		
		else if (door == 1)
		{
	        System.out.print("The goat is behind door 2	");
	        System.out.print("\nWould you like to switch to door 3? ");
	        doorswitch = keyboard.nextLine();
	       
	        
	                if (doorswitch.equals("yes"))
	    	        System.out.print("The car was behind " +" " + carDoor);
	                if (3 == carDoor)
		    	        System.out.print("\nYou won ");
		        
	    	        else if (3 != carDoor)
	    	        {
	    	        System.out.print("\nYou lost ");
	    	        }
	          
	              
	      
					if (3 == carDoor)
					    System.out.print("\nYou won ");
					
					else if (3 != carDoor)
					{
					System.out.print("\nYou lost, the car was behind " + carDoor);
					    }
					
					else if (doorswitch.equals("no"))
					{
					System.out.print("The car was behind " +" " + carDoor); 
					if (door == carDoor)
					System.out.print("\nYou won! ");
					else if (door != carDoor)
					System.out.print("\nYou lost ");
					}
	        }
		else if (door == 2)
		{
			System.out.print("The goat is behind door 3" );
			System.out.print("\nWould you like to switch to door 1? ");		
			doorswitch = keyboard.nextLine();
			if (doorswitch.equals("yes"))
			System.out.print("The car was behind " +" " + carDoor1);
			if (1 == carDoor1)
			System.out.print("\nYou won ");
			else if (1 != carDoor1)
			{
			System.out.print("\nYou lost ");
			}
			else if (doorswitch.equals("no"))
			{
			System.out.print("The car was behind "+" " + carDoor1);
			if (door == carDoor1)
			System.out.print("\nYou won! ");
			else if (door != carDoor1)
			System.out.print("\nYou lost ");
			}
		}
		else if (door == 3)
		{
			
			System.out.print("The goat is behind door 1 ");
			System.out.print("Would you like to switch to door 2? ");
			doorswitch = keyboard.nextLine();
			
			if (doorswitch.equals ("yes"))
			System.out.print("The car was behind " +" " + carDoor2);
			if (2 == carDoor2)
			
				
			System.out.print("\nYou won! ");
			
			else if (2 != carDoor2)
			{
			System.out.print("\nYou lost. ");
			}
			else if (doorswitch.equals ("no"))
			{
			System.out.print("The car was behind " +" " + carDoor2);
			if (door == carDoor2)
			
	        System.out.print("\nYou won! ");
	        
	    
			if (door != carDoor2)
			System.out.print("\nYou lost ");
			}
		}
		
	}
	
}
		
	
	
		
		