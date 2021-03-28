//Program for finding the simple interest
package scann;
import java.util.Scanner;

public class Simpleinterset {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		float principal;
		float rate;
		int time;
		
		
		System.out.println("Enter principal amount : ");
	    principal=sc.nextFloat();
		System.out.println("Enter rate : ");
		rate=sc.nextFloat();
		System.out.println("Enter time : ");
		time=sc.nextInt();
		
		float si=(principal*rate*time)/100;
		System.out.println("The si is :"+si);
		sc.close();
		
		
		
		
	}
	

}
