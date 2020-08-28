package Assignment;
import java.util.Scanner;

public class DeleteElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num=new int[10];
		int[] ca=new int[10];
		int i,j=0;
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter 6 numbers");
		for(i=0;i<6;i++)
		{
			num[i]=inp.nextInt();
		}
		System.out.println("Changed original array:");
		for(i=0;i<6-1;i++)
		{
			if(num[i]!=num[i+1])
			{
				ca[j++]=num[i];
			}
		}
		ca[j++]=num[6-1];
		for(i=0;i<j;i++)
		{
			num[i]=ca[i];
			System.out.println(num[i]);

		}
	}

}
