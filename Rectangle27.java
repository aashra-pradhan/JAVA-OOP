/*Make class “Rectangle with attributes length ,breadth and area as instance variable. The class contains 
methods computeArea (no parameters and no return type)and displayArea(no return type and no return type).
Write a program with main method that creates two objects of Rectangle class and find their areas and display
 area of larger rectangle.*/
 
 class Rectangle27
 {
	 int l, b, area;
	 
	 void computeArea(){
		 area=l*b;
	 }
	 
	 void displayArea(){
		 System.out.println("Area of (larger) rectangle is =" + area);
	 }
 }
		

