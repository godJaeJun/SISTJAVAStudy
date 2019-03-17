import java.util.Scanner;
public class Testt
{
	public static void main(String[] args) {
 
		 int[] list = {1,2,3,4,5}; 
		 
		 for(int n:list)
			 System.out.print(list[i]+" ");
		
		 for(int i = 1; i < list.length-1; i++) { 
		  list[i] = list[i+1];  
		 }

		 for(int n:list)
			 System.out.print(list[i]+" ");
	}
}