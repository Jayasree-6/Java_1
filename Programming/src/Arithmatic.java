import java.util.Scanner;
class MainPattern 
{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any two integer values:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.println("*");
			}
			System.out.println();
			
		}
	}
}
		