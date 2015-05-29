package If_Statements;

public class What_if {
	
	public static void main(String[] args) {
		
		int people = 20;
		int cats = 20;
		int dogs = 15;

		if ( people < cats ) //if people is less than cats 
		{ 					//if statement is true than enter in these braces
			System.out.println( "Too many cats!  The world is doomed!" );
		}

		if ( people > cats ) //if people is greater than cats
		{					//if statement is true than enter in these braces
			System.out.println( "Not many cats!  The world is saved!" );
		}

		if ( people < dogs ) //if people is less than dogs
		{
			System.out.println( "The world is drooled on!" );
		}

		if ( people > dogs ) //if people is greater than dogs
		{
			System.out.println( "The world is dry!" );
		}

		dogs += 5;

		if ( people >= dogs ) // if people is greater and equal than dogs
		{
			System.out.println( "People are greater than or equal to dogs." );
		}

		if ( people <= dogs )// if people is less and equal than dogs
		{
			System.out.println( "People are less than or equal to dogs." );
		}

		if ( people == dogs )//if people is equel than dogs
		{
			System.out.println( "People are dogs." );
		}
	}
}
