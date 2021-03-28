//Program for hypotenuse 
package scann;
import java.util.Scanner;

public class hypotenuse {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double x;
		double y;
		double z;
		System.out.println("Enter x :");
		x=sc.nextDouble();
		System.out.println("Enter y :");
		y=sc.nextDouble();
		z=Math.sqrt((x*x)+(y*y));
		System.out.println("The hypotenuse is :"+z);
		sc.close();
		
		
	}

}
