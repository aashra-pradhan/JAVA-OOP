class Imain31
{
	public static void main(String[] args)
	{
		Student31[] stu=new Student31[5];
		
		Student31 s1=new Student31();
		Student31 s2=new Student31();
		Student31 s3=new Student31();
		Student31 s4=new Student31();
		Student31 s5=new Student31();
		
		stu[0]=s1;
		stu[1]=s2;
		stu[2]=s3;
		stu[3]=s4;
		stu[4]=s5;
		
		
		for(int i=0;i<stu.length;i++){
			stu[i].input();
		}
		
		for(int i=0;i<stu.length;i++){
			if(stu[i].age>=24){
				System.out.println("Name is " + stu[i].name + " and age is " + stu[i].age);
			}
		}
	}
}