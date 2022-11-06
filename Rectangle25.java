/*Create a Class Rectangle having length, breadth and area as instance variable. Create a function name Set (no parameter and no return
 type) to take the user input for length and breadth. Then create another function name Calculate (no parameter and no return type) to 
 calculate the area and display the area of rectangle. Create another class Imain having main () function to create an object of 
 Rectangle class and invoke the function.*/
 
import java.util.*;
class Rectangle25{
		Scanner scan=new Scanner(System.in);
		int l;
		int b;
		int area;
		
		void set()
		{
			System.out.println("enter thhe length and breadth of the rectangle:");
			l=scan.nextInt();
			b=scan.nextInt();
		}
		
		void calculate()
		{
			area=l*b;
			System.out.println("Area is " + area);
		}
	
}