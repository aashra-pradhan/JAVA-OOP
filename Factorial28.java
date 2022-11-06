/*Create a class Factorial having instance variable result.Class contains the function name int FindFact(int n)
 then calculate the factorial of number n and return and print in the main function*/
 
 class Factorial28
 {
	 int result;
	  
	 int FindFact(int n){
		 result=1;
		 for(int i=1;i<=n;i++){
			 result=result*i;
		 }
		return result;
	 }
	 
 }

