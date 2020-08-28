package Assignment;
import java.util.Scanner;

public class Intersection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,ca;
		int[] num1=new int[10];
		int[] num2=new int[10];
		Scanner inp=new Scanner(System.in);
		System.out.println("1. Enter 5 numbers");
		for(i=0;i<5;i++){
			num1[i]=inp.nextInt();
		}
		System.out.println("2. Enter 5 numbers");
		for(i=0;i<5;i++){
			num2[i]=inp.nextInt();
		}
		System.out.println("Intersections:");
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				if(num1[i]==num2[j])
				{
					System.out.print(num1[i]+" ");
				}
			}
		}
        
     }
}
