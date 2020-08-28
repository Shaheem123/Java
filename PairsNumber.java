package Assignment;
import java.util.Scanner;
public class PairsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] num=new int[10];
		int i,j,n;
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter 6 numbers");
		for(i=0;i<6;i++)
		{
			num[i]=inp.nextInt();
		}
		System.out.println("Enter N number");
		n=inp.nextInt();
		System.out.println("Pair numbers of "+n+" are:");

		for(i=0;i<6;i++)
		{
			for (j=i+1;j<6;j++)
			{
				if(num[i]+num[j]==n)
				{
					System.out.println(num[i]+"+"+num[j]+"="+n);
				}
			}
		}*/
		 Scanner sc = new Scanner(System.in); //Taking rows value from the user    
	        System.out.println("Enter the number of rows: ");    
	        int rows = sc.nextInt();         
	        for (int i = 1; i <= rows; i++) 
	        {
	            for (int j = 1; j <= i; j++)
	            {
	                System.out.print(i+" ");
	            }
	               
	            System.out.println();
	        }         
	        sc.close();
	}

}
