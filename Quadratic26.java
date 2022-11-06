/*Create a Class Quadratic having a, b, c, x1, and x2 as instance variable. Create a function name Input 
(no parameter and no return type)to take the user input for a, b, and c. Then create another function name 
Calculate (no parameter and no return type) to calculate two roots and assign to variable x1 and x2. Also Create
another function name Display (no parameter and no return type) to display the tworoots. Create another class
Imain having main () function to create an object of Quadratic class and invoke the function.*/
 
import java.util.*;

class Quadratic26
{
	Scanner scan=new Scanner(System.in);
	int a,b,c;
	double x1,x2; //roots come in double datatype(point), be careful
	
	void Input(){
		System.out.println("Enter values of a,b,c");
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
	}
	
	void Calculate(){
		double e1= Math.pow((b*b-4*a*c),(1/2)); //arko main class le ya aru functions of the same class le access nagarnuparne variabler lai function bhitrai define garne, these are private, called static variables and cannot be accessed by other functions or other classes whereas the variables that need to be accessed by other classes lai mathi nai define garnuparchas and they are called instance variables.
		x1=(-b + e1)/(2*a);
		x2=(-b - e1 )/(2*a);
	}
	
	void Display(){
		System.out.println("The first root is" + x1 + "and the second root is " + x2);
	}
}
		