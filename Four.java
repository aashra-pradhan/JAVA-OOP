import java.util.*;

class Four
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		double p;
		double t;
		double r;
		double sim;

		System.out.println("Please enter principal, time and rate");
		p=scan.nextDouble();
		t=scan.nextDouble();
		r=scan.nextDouble();

		sim=(p*t*r)/100;

		System.out.println("Simple interest is:\t"+sim);
	}

}
