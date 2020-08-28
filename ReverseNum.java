package Array1;
import java.util.Scanner;
public class ReverseNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num=new int[9];
		int[] rev=new int[9];
		int i;
		Scanner inp=new Scanner(System.in);
		System.out.println("Enput 5 numbers:");
		for(i=0;i<5;i++)
		{
			num[i]=inp.nextInt();
		}
		System.out.println("Reverse numbers:");
		for(i=5-1;i>=0;i--)
		{
			rev[i]=num[i];
			System.out.println(rev[i]+" ");
		}
	}

}
