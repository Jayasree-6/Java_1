import java.util.Scanner;
public class digit
{public static void main(String[] args)
{Scanner sc=new Scanner(System.in);
System.out.println("enter 2 digit integer:");
int n=sc.nextInt();
int d1=n/10;
int d2=n%10;
int st=(d1>d2)?d1:d2;
System.out.println(st+  " is  biggest number "+n);

	
}

}
