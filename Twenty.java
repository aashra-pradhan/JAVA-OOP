import java.util.*;
class Twenty
{
	public static void main(String args[])
	{
		Scanner st=new Scanner(System.in);
		System.out.println("Enter no. of elements");
		int n=st.nextInt();
		
		int sum=0; //=0 very imp otherwise error message display huncha not initialized bhanera
		
		int[] a;
		a=new int[n];
		
		System.out.println("Enter elements of array!!");
		
		for(int i=0;i<n;i++){
			a[i]=st.nextInt();
			sum=sum+a[i];
		}
		
		
		System.out.println("The sum of elements is:\t" + sum);
		
	}
}