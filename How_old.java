package If_Statements;

import java.util.Scanner;

public class How_old {

	private static String name;
	private static int age;
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);

		System.out.println("Hey, what's your name? ");
		name = in.next();
		System.out.println("Ok, "+ name +", how old are you?");
		age = in.nextInt();
		
		if(age < 16)
		{
			System.out.println(" You can't drive. " + name);
		}
		else if(age < 18)
		{
			System.out.println("You can't vote. "+ name);
		}
		else if(age <25)
		{
			System.out.println("You can't rent a car. "+ name);
		}
		else if(age == 25 || age >25)
		{
			System.out.println("You can do anything that's legal. "+ name);
		}
	}

}
