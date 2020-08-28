package Assignment;
import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,ca;
		int[] num1=new int[10];
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		for(i=0;i<5;i++){
			num1[i]=inp.nextInt();
		}
		System.out.println("Second largest number:");

		for ( i = 0; i <5; i++)   
        {  
            for ( j = i + 1; j < 5; j++)   
            {  
                if (num1[i] > num1[j])   
                {  
                    ca = num1[i];  
                    num1[i] = num1[j];  
                    num1[j] = ca;  
                }   
            }  
        }  
		System.out.println(num1[5-2]);
	}

}
