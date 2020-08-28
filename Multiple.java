package Assignment;
public class Multiple {
	public static void main(String[] args) {
		int num1[][]={{1,2},{3,4},{5,6}};
		int num2[][]={{1,2,3},{1,2,3}};	
		int[][] mul=new int[3][3];
		int i,j,k;
	System.out.println("A:");
		for(i=0;i<3;i++)		{
			for(j=0;j<2;j++)			{
				System.out.print(num1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("B:");
		for(i=0;i<2;i++)		{
			for(j=0;j<3;j++)			{
				System.out.print(num2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("\nA x B:");
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				mul[i][j]=0;
				for(k=0;k<2;k++){
					mul[i][j]+=num1[i][k]*num2[k][j];
				}
				System.out.print(mul[i][j]+" ");
			}
			System.out.println();
		}}}
