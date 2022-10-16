import java.util.*;
class TwentyOne{
	public static void main(String args[]){
		int n; 
		int[] a;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the nuumber of elements in an array:");
		n=scan.nextInt();
		
		a=new int[n]; // new ko n small int ko i ni small be carefuland there is space in between
		
		for(int i=0;i<n;i++){
			System.out.println("Enter " + i + "th element of array");
			a[i]=scan.nextInt();
		}
		
		int max=a[0];
		
		for(int i=1;i<n;i++){
			if(a[i]>max){
				max=a[i];
			}
		}
		
		int min=a[0];
		
		for(int i=1;i<n;i++){
			if(a[i]<min){
				min=a[i];
			}
		}
		
		System.out.println("Max element is " + max + " and min element is " + min);
	}
}
		
		
		
		