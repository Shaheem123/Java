package Array1;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter a string:");
		name=inp.nextLine();
		int ln=name.length();
		char[] rev=new char[ln];
		for(int i=0;i<ln;i++)
		{
			rev[ln-i-1]=name.charAt(i);
		}
		String n=String.copyValueOf(rev);
		System.out.print("Reverse:"+n);
	}

}
