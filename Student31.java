/*Create a class Student having instance variable age and name and class also contains a function name void 
input( ) for user input age and name. Then create another class Imain and create an array of size 5 of Student
(yaha Student matlab class "Student" be careful haii(so esko matlab array ma student class ko objects lai halne)
 then store the Student in array and print those records of array whose age is greater than or equal to 24.

Pseudocode:
class Student
{
          int age;
         void input( )
        {
                  //input goes here
       }
} 

class Imain
{
      Student[ ] lstStudent = new Student[ 5];
       //Create 5 objects of Student and store in Array lstStudent
      //print the  roll and name of students stored in array whose 
         ages is greater or equal to 24
}
*/

import java.util.*;
class Student31
{
	int age;
	String name; //String ko 's' capital hai int haruko 'i' small bhayepani
	Scanner scan=new Scanner(System.in);
	
	void input(){
		System.out.println("Enter name"); /*yo string input lai sabse first mai rakha natra tala, 
										mathi ko enter lai nai input thanera name nai rakhna mildaina, 
										C programming ma ta %*c use garthyam esko solution, java ma ni 
										maybe kei solution hola, ask sir, until then string input lai 
										first ma leu.*/								
		name=scan.nextLine();
		System.out.println("Enter age");
		age=scan.nextInt();
		
	}
}
