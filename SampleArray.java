package Array1;
import java.util.Scanner;
public class SampleArray {

	public static void main(String[] args) {
	/*	int a[]={11,12,13,14,15};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(+a[i]);
		}*/
		int i,n,x[],y[];
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		x= new int[n];
		y=new int[n];
		for(i=0;i<n;i++)
		{
		x[i]=s.nextInt();
		y[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
		if(x[i]<y[i])
		System.out.println("Incompatible");
		System.out.print("Compatible");
	
	
		}
	return;
	}

}
