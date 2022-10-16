import java.util.*;
class Five
{
		public static void main(String args[])
		{ 
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the principal, time and rate");
			double p = scan.nextDouble();
			double t = scan.nextDouble();
			double r = scan.nextDouble();

			double Comp =p*(Math.pow(1+(r/100),t))-p;
			System.out.println("Compound Interest is" +Comp);

		}

}
