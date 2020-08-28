package Array1;
import java.util.Scanner;
public class DuplicateChar {

	public static void main(String[] args) {
		String string1;
		Scanner in=new Scanner(System.in);
	    int count;  
	    System.out.println("Enter a sentence:");
	    string1=in.nextLine();  
	    char string[] = string1.toCharArray();            
	    System.out.println("Count of Duplicate characters: ");    
	    for(int i = 0; i <string.length; i++)
	    {  
	    	count = 1;  
	    	for(int j = i+1; j <string.length; j++) 
	    	{  
	    		if(string[i] == string[j] && string[i] != ' ')
	    		{  
	    			count++;   
	    			string[j] = '0';  
	            }  
	        }   
	        if(count > 1 && string[i] != '0')
	        {
	        	System.out.println(string[i]+" "+count);  
	        }
	     }  
	}

}
