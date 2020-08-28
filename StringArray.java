package Array1;
import java.io.*;
import java.util.Scanner;
public class StringArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String[] name={"Balu","Alu","Milu","Bakir","Sam"};
		System.out.println("Here is the name list");
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}*/
		 /* int i,j,k,l,n;
	        Scanner in=new Scanner(System.in);
	        n=in.nextInt();
	       // for(i=1;i<=n;i++)
	        for(i=1;i<=n;i++)
	        {
	            //for(j=n;j>i;j--)
	        	for(j=1;j<i;j++)
	            {
	                System.out.print("b");
	            }
	            //for(k=1+1;k<=j*2;k++)
	            for(k=n*2;k>=j*2;k--)
	        	{
	                System.out.print("*");
	            }
	            //for(l=n;l>i;l--)
	            for(l=1;l<i;l++)
	            {
	                System.out.print("b");
	            }
	            System.out.print("\n");
	        }*/
   /* int a=1,b=1,c=0,i,n,d; 
         Scanner sc=new Scanner(System.in); 
         i=sc.nextInt(); 
         n=i*2; 
         d=i; 
         while( i>=1 ) 
         { 
             c=a*b; 
             a=c; 
             b++; 
             d++; 
             if( i==c ) 
             { 
                 System.out.println("yes"); 
                 d=n; 
             } 
         } 
         if( i!=d ) 
         { 
             System.out.println("no"); 
         } */
int num;
float score=0;
int PCOUNT=0;
Scanner s=new Scanner(System.in);
do
{
	
	num=s.nextInt();
		
		

	if(num%2 == 0 && num>0)
	{
		
		score -=0.5;
		

	}
	
	else if(num>0)
	{
		score +=1;
		PCOUNT++;
	}


}
while(num>0 && PCOUNT<3);
if(PCOUNT!=3)
	
	score -=1;
System.out.println(score);

 

	}

}
