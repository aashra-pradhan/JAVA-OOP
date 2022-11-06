import java.util.*;

class Imain28
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		Factorial28 f1=new Factorial28();
		
		System.out.println("Enter a number whose factorial you want to calculate");
		int a=scan.nextInt();
		
		int fac=f1.FindFact(a);
		
		System.out.println("The factorial is =" + fac);
	}
}