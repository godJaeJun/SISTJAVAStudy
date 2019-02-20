public class Star
{
	public static void main(String[] args)
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
		System.out.println();
		}
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++)
			{	
				System.out.print(j<(4-i)?" ":"*");
			}
			System.out.println();
		}
		for(int i=0;i<5;i++){
			for(int j=i;j<5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++)
			{	
				System.out.print(j<i?" ":"*");
			}
			System.out.println();
		}
		for(int i=0;i<5;i++){
			for(int j=4-i;j>0;j--){
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}