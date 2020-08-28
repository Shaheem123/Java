package Assignment;
import java.util.Scanner;
public class Common {
	public static void main(String[] args) {
		int[] num1=new int[10];
		int[] num2=new int[10];
		int[] num3=new int[10];
		int i,j,k;
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter 4 numbers");
		for(i=0;i<4;i++)
			num1[i]=inp.nextInt();
		System.out.println("Enter 4 numbers");
		for(i=0;i<4;i++)
			num2[i]=inp.nextInt();
		System.out.println("Enter 4 numbers");
		for(i=0;i<4;i++)
			num3[i]=inp.nextInt();
		int l = 0, m = 0, n = 0; 
	    while (l < num1.length && m < num2.length && n < num3.length) 
        { 
             if (num1[l] == num2[m] && num2[m] == num3[n]) 
             {   System.out.print(num1[i]+" ");
             l++; 
             m++;
             n++; }  
             else if (num1[l] < num2[m]) 
                 l++; 
             else if (num2[m] < num3[n]) 
                 m++; 
             else
                 n++; 
            
        } 
	    System.out.print(num1[l]+" "+num2[l]+" "+num3[l]);
	}

}
