package Array1;
import java.util.Scanner;
public class Triplets {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num=new int[10];
		int n,m,i,j,k,sol=0;
		Scanner im=new Scanner(System.in);
		System.out.print("Enter a number:");
		n=im.nextInt();
		System.out.print("Enter N number:");
		m=im.nextInt();
		System.out.println("Enter "+m+" numbers:");
		for(i=0;i<m;i++)
		{
			num[i]=im.nextInt();
		}
		System.out.print("No of triplets :");
		for (i = 0; i < num.length - 2; i++) 
		{
            for ( j = i + 1; j < num.length - 1; j++) 
            {
            	for ( k = j + 1; k < num.length; k++) 
            	{
            		if (num[i] * num[j] * num[k] == n) 
            		{
            			sol++;
            		}
            	}
            }
		}
		System.out.print(sol);
	}

}
