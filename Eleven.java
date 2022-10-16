import java.util.*;

class Eleven
{
	public static void main(String[] args)
	{
		Scanner st= new Scanner(System.in);

		System.out.println("[1] January\n[2] February\n[3] March\n[4] April\n[5] May\n[6] June\n[7] July\n[8] August\n[9] September\n[10] October\n[11] November\n[12] December");
		System.out.println("Choose:");
		int a=st.nextInt();
		switch(a)
		{
			case 1:
			System.out.println("31 days");
			break;

			case 2:
			System.out.println("28 days");
			break;

			case 3:
			System.out.println("31 days");
			break;

			case 4:
			System.out.println("30 days");
			break;

			case 5:
			System.out.println("31 days");
			break;

			case 6:
			System.out.println("30 days");
			break;

			case 7:
			System.out.println("31 days");
			break;

			case 8:
			System.out.println("31 days");
			break;

			case 9:
			System.out.println("30 days");
			break;

			case 10:
			System.out.println("31 days");
			break;

			case 11:
			System.out.println("30 days");
			break;

			case 12:
			System.out.println("31 days");
			break;

			default:
			System.out.println("Invalid choice!!");
			break;
		}
	}

}
