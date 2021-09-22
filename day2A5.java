import java.util.*;

class Fibo1{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a=0,b=1;
 
         System.out.println("Enter the range: ");
         int range=sc.nextInt();
        

        System.out.println(a+b);

         fibo(range);


		
	}

	static void fibo(int n)
		{
			int a=0,b=1,c=0;
			for(int i=1;i<=n;i++)
			{
				 c=a+b;
				System.out.println(c);
				a=b;
				b=c;
			}
			
		}
}