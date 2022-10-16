import java.util.*;

class Six

{

	public static void main(String args[])

	{
		Scanner scan =new Scanner(System.in);

		String name;

		String Gender;

		String DOB;

		System.out.println("Enter your Name, Gender and DOB");

		name =scan.nextLine();

		Gender = scan.nextLine();

		DOB =  scan.nextLine();;

		//Printing personal information

		System.out.println("Your Name is " + name);

		System.out.println("Your Gender is " + Gender);

		System.out.println("Your DOB is " + DOB);

	}

}