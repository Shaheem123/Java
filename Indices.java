package Array1;
import java.util.Scanner;
public class Indices {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] num=new int[10];
		int i,n,count=0,count1=0,k;
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter N number:");
		n=inp.nextInt();
		System.out.println("Enter "+n+" numbers :");
		for(i=0;i<n;i++)
		{
			num[i]=inp.nextInt();
		}
		System.out.print("No of elements which and indices are same of even or odd: ");
		for(i=0;i<n;i++)
		{
			if(((num[i]%2==0)&&(i%2==0))||((num[i]%2!=0)&&(i%2!=0)))
			{
				count++;
			}
		}		
		System.out.print(+count);*/
	
			  int n,s,i,j;
        String[] name=new String[10];
        int[] mark=new int[10];
        int tot=0;
        int[] avg1=new int[10];
        
       
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of students");
        n=in.nextInt();
        System.out.println("Enter the number of subjects");
        s=in.nextInt();
        
        for( i=0;i<n;i++)
        {
            System.out.println("Enter the name of student "+(i+1));
            name[i]=in.next();
            System.out.println("Enter the "+s+" subject marks of student "+(i+1));
            tot=0;
            for(j=0;j<s;j++)
            {
                mark[j]=in.nextInt();
                tot+=mark[j];
            }
            avg1[i]=tot/s;
        }
        System.out.println("Student Results");
        	//System.out.print(name[i]+" - ");
        for(i=0;i<n;i++)
        {
        		if(avg1[i]>=80&&avg1[i]<=100)
        		{
        			System.out.println(name[i]+" - Distinction");
        		}
        		else if(avg1[i]>=70&&avg1[i]<80)
        		{
        			System.out.println(name[i]+" - First class"); 
        		}
        		else if(avg1[i]>=50&&avg1[i]<70)
        		{
        			System.out.println(name[i]+" - Pass");
        		}
        		else if(avg1[i]<50)
        		{
        			System.out.println(name[i]+" - Fail");
        		}
        		else if(avg1[i]<0||avg1[i]>100)
        		{
        			System.out.println(name[i]+" - Invalid");
        		}
        			
        	
        }
     
        in.close();
        
	}

}
