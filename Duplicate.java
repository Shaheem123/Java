package Assignment;
import java.util.Scanner;
public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num=new int[10];
		int i,j;
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter 6 numbers");
		for(i=0;i<6;i++)
		{
			num[i]=inp.nextInt();
		}
		System.out.println("Duplicate numbers");
		for(i=0;i<6;i++)
		{
			for (j=i+1;j<6;j++)
			{
				if(num[i]==num[j])
				{
					System.out.println(num[j]);

				}
			}
		}
		
	}

}
