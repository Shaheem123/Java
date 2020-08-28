package Array1;
import java.util.Scanner;
public class Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num=new int[15];
		int i,n,x,count=0;
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter N number:");
		n=inp.nextInt();
		System.out.println("Enter "+n+" number:");
	
		for(i=0;i<n;i++)
		{
			num[i]=inp.nextInt();
		}
		System.out.println("Enter X number:");
		x=inp.nextInt();
		for(i=0;i<n;i++)
		{
		if(x==num[i])
		{
			count++;
		}
		}
		System.out.println("Occurs: ");

		System.out.println(count++);
	}

}
