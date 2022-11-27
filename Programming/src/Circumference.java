import java.util.Scanner;
public class Circumference {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius:");
		double r=sc.nextDouble();
		double area=3.143*r*r;
		double cir=2*3.143*r;
		System.out.println("radius is:"+r);
		System.out.println("area is:"+area);
		System.out.println("circumference is:"+cir);
	}

}
