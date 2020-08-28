package Array1;
import java.util.Scanner;
public class SmallBig {
	public static void main(String[] args) {
		// To show smallest and largest number
		int[] a=new int[10];
		int lar ,smal;
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter 5 numbers:");
		for(int i=0;i<5;i++)
		{
			a[i]=inp.nextInt();
		}
		smal=a[0];
		lar=a[0];
		
		for(int i=0;i<5;i++)
		{
			if(lar<a[i])
			{
					lar=a[i];
			
			}
			else if(smal>a[i])
			{
				smal=a[i];
			}
		}
		System.out.println("Smallest number :"+smal);
		System.out.println("Largest number :"+lar);
	}

}
