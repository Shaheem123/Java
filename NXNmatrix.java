package Assignment;
import java.util.Scanner;
public class NXNmatrix {
	public static void main(String[] args) {
		int n,i,j;
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter N number:");
		n=inp.nextInt();
		int[][] num1=new int[10][10];
		int[][] num2=new int[10][10];
		int[][] mul=new int[n][n];
		System.out.println("Enter "+n*n+" elements in first matrix:");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				num1[i][j]=inp.nextInt();
			}
		}System.out.println("Enter "+n+" elements in second matrix:");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				num2[i][j]=inp.nextInt();
			}
		}		
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				mul[i][j]=num1[i][j]*num2[i][j];
			}
		}
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				System.out.print(mul[i][j]+" ");
			}
			System.out.println();
			}		}}
