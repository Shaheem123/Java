package Array1;
import java.util.Scanner;
public class Destination {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[6];
		int i;
		int[] dest=new int[7];
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 5 numbers :");
		for(i=0;i<5;i++)
		{
			num[i]=in.nextInt();
		}
		System.out.println("Destination array:");
		for(i=0;i<5;i++)
		{
			dest[i]=num[i];
			System.out.println(dest[i]);
		}
	}

}
