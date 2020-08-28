package Array1;
import java.util.Scanner;
public class BubbleSort {
	public static void main(String[] args) {
		int[] num=new int[5];
		int i,j,lar,smal,so;
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter 5 numbers:");
		for(i=0;i<5;i++)
		{
			num[i]=inp.nextInt();
		}
		System.out.println("Sorted array:");
		for(i=0;i<5-1;i++)
		{
			for(j=0;j<5-i-1;j++)
			{
				if(num[j]>num[j+1])
				{
					so=num[j];
					num[j]=num[j+1];
					num[j+1]=so;
				}}}
		lar=num[0];
		smal=num[0];
		for(i=0;i<5;i++)
		{	System.out.println(num[i]);
			if(lar<num[i])
					lar=num[i];
			else if(smal>num[i])
				smal=num[i];
		}
		System.out.println("Smallest number :"+smal);
		System.out.println("Largest number :"+lar);
	}

}
