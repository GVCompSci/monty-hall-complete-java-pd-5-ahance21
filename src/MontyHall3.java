import java.util.Random;
import java.util.Scanner;

public class MontyHall3 {

	public static void main(String[] args) 
	
	{
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		int carDoor = rand.nextInt(3) + 1;
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
        while (roll == carDoor)
        win++;
        
        
        } 
	}

}
