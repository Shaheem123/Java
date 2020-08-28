package Array1;
import java.util.Scanner;

public class Position {

	public static void main(String[] args) {
		// To show the position(index)
		int[] a=new int[200];
		int b,co=0;
		Scanner inp=new Scanner(System.in);
		/*System.out.println("Enter 4 numbers:");
		for(int i=0;i<4;i++)
		{
			a[i]=inp.nextInt();
		}*/
		System.out.println("Even positions :");
		for(int i=0;i<=180;i=i+2)
		{
			co++;
			//System.out.println(i);
		}
		
		System.out.print(co);
		
		

	}

}
