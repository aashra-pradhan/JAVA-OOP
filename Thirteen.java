import java.util.*;
class  Thirteen
{
	public static void main(String[] args)
	{
		Scanner st= new Scanner(System.in);
		System.out.println("Enter two numbers:");
		double a = st.nextDouble();
		double b = st.nextDouble();
		System.out.println("Choose:");
		String str = st.next();
		char c =str.charAt(0);

		switch(c)
		{
			case '+':
			double sum = a+b;
			System.out.println("Sum = "+sum);
			break;

			case '-':
			double sub = a-b;
			System.out.println("Difference = "+sub);
			break;

			case '*':
			double multi = a*b;
			System.out.println("Multiplication = "+multi);
			break;

			case '/':
			double div = a/b;
			System.out.println("Division= "+div);
			break;

			default:
			System.out.println("Invalid choice!!");
			break;
		}
	}
}


