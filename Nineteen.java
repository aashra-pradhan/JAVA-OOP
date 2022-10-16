import java.util.*;
class Nineteen
{
	public static void main(String args[])
	{
		Scanner st=new Scanner(System.in);
		int[] a;
		a=new int[10];
		
		int b;
		
		System.out.println("Enter 10 integers for sorting!!");
		
		for(int i=0;i<10;i++){
			a[i]=st.nextInt();
		}
		
		for(int i=0;i<10;i++){
			for(int j=i+1;j<10;j++){
				if(a[i]>a[j]){
					b=a[i];
					a[i]=a[j];
					a[j]=b;
				}
			}
		}
		
		System.out.println("The sorted integers are:");
		
		for(int i=0;i<10;i++){
			System.out.println(a[i]);
		}
	}
}