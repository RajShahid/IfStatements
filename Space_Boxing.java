package If_Statements;

import java.util.Scanner;

public class Space_Boxing {

	
	public static void main(String[] args) {
		
		double venus = 0.78;
		double mars = 0.39;
		double jupiter = 2.65;
		double saturn = 1.17;
		double uranus =1.05;
		double neptune = 1.23;
		int age;
		int no;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter your current weight on Earth ");
		age = in.nextInt();
		
		System.out.println("I have information for the following planets: ");
		System.out.println("1 Venus ,2 Mars ,3 Jupter ,4 Saturn ,5 Uranus ,6 Neptune ");
		System.out.println("Which Planet are you visiting ");
		no = in.nextInt();
		if(no == 1)
		{
			System.out.println("Your weight would be " + venus*0.39 + " pounds on that planet.");
		}
		else if(no == 2)
		{
			System.out.println("Your weight would be " + mars*0.39 + " pounds on that planet.");
		}
		else if(no == 3)
		{
			System.out.println("Your weight would be " + jupiter*0.39 + " pounds on that planet.");
		}
		else if(no == 4)
		{
			System.out.println("Your weight would be " + saturn*0.39 + " pounds on that planet.");
		}
		else if(no == 5)
		{
			System.out.println("Your weight would be " + uranus*0.39 + " pounds on that planet.");
		}
		else if(no == 6)
		{
			System.out.println("Your weight would be " + neptune*0.39 + " pounds on that planet.");
		}
		else
		{
			System.out.println("Wrong Input");
		}
	}

}
