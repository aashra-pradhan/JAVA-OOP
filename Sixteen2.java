class Sixteen2{
	public static void main(String args[]){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5-i;j++){
				System.out.print(" "); //no ln
			}
			for(int k=1;k<=i;k++){
				System.out.print("*"); //no ln
			}
			System.out.println();
		}
	}
}