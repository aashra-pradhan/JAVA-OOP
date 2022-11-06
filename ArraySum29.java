/*Create a class ArraySum having instance variable sum then class contains the function name int Sum(int[ ] a)
 then calculate the sum of array elements and return and print in the main function
1 2 3 4 5 6 7 8 9 10
Sum= 55 '&uk
Note: a is an integer array */

class  ArraySum29
{
	int sum=0;
	
	int Sum(int[] a){
		for(int i=0;i<a.length;i++){ //yaha < matra ho not <= because you know array ko index starts from 0 and not 1 i.e, starts from a[0].
			sum=sum+a[i];
		}
		return sum;
	}
}