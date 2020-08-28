package Assignment;

public class MissingNumber {
	public static void main(String[] args) {
		int i,k,m;
		int num;
		boolean tr;
		int no[]={1,6,4,8,2,9,23,22};
		System.out.println("Numbers :");
		for(i=0;i<no.length;i++)
		{
			System.out.print(no[i]+" ");
		}
		System.out.println("\nMissing numbers from 1 to 25:");
		int j=0;
		for(k=1;k<=25;k++)
		{
			tr=false;
			for(m=0;m<no.length;m++)
			{
			if(k==no[m])
			{
				tr=true;
			}
			}
			if(!tr)
			{
				System.out.println(k+" ");
			}

		}

	}

}
