package Array1;
import java.util.Scanner;
import java.util.Arrays;
public class Function1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n,a[],b[],c[],i=0,j=0,k=0,l=0;
	        Scanner in=new Scanner(System.in);
	        System.out.println("Enter the number of elements in an array");
	        n=in.nextInt();
	        a=new int[n];
	        b=new int[n];
	        c=new int[n];
	        int[] s=new int[10];
	        System.out.println("Enter the elements of first array");
	        for(i=0;i<n;i++)
	        {
	            a[i]=in.nextInt();
	        }
	        System.out.println("Enter the elements of second array");
	        for(i=0;i<n;i++)
	        {
	            b[i]=in.nextInt();
	        }
	        System.out.println("Enter the elements of third array");
	        for(i=0;i<n;i++)
	        {
	            c[i]=in.nextInt();
	        }
	        System.out.println("Common elements in three sorted arrays are");
	   
	            for(i=0;i<n;i++)
	            {
	            	for(j=0;j<n;j++)
	            	{
	            		for(k=0;k<n;k++)
	            		{
	            		if(a[i]==b[j]&&b[j]==c[k])
	            		{
	                	System.out.println(a[i]);
	                    
	            		}
	            		}
	            	}
	              
	            }
	        
	}

}
