package Array1;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		// To show even numbers in array

		int[] a=new int[10];
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter 5 numbers:");
		for(int i=0;i<5;i++)
		{
			a[i]=inp.nextInt();
		}
		System.out.println("Even numbers :");
		for(int i=1;i<5;i++)
		{
		
			if(a[i]%2==0)
			{
			System.out.println(a[i]);
			}
		}
	}

}
