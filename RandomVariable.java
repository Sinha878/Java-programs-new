//Number guessing game using Random package

package scann;
import java.util.Random;
import java.util.Scanner;

public class RandomVariable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rar=new Random();

		System.out.print("Enter your number between 1-6 : ");
        int y=sc.nextInt();
        int x=rar.nextInt(6)+1;
        if (x==y)
        {
        	System.out.print("You have got the right guess");
        }
        else 
        	System.out.print("Better luck next time");
        sc.close();
	}

}
