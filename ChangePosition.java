package Assignment;
import java.util.Scanner;
public class ChangePosition {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len, inp, i, pos;
	       int num[] = new int[50];
	       Scanner input = new Scanner(System.in);  
	       System.out.print("Enter N number : ");
	       len = input.nextInt(); 
	       System.out.println("Enter "+len+" Elements : ");
	       for(i=0; i<len; i++)
	       {
	           num[i] = input.nextInt();
	       }
	       System.out.print("Enter Element to change : ");
	       inp = input.nextInt();
	       System.out.print("Enter Index Number : ");
	       pos = input.nextInt(); 
	       for(i=len; i>pos; i--)
	       {
	           num[i] = num[i-1];
	       }
	       num[pos] = inp;
	       System.out.print("New Array:\n");
	       for(i=0; i<len; i++)
	       {
	           System.out.print(num[i]+ " ");
	       }
	}

}
