import java.util.*;
import java.Math.*;

class A3{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

        System.out.println("Enter I for byte,short,int,long and D for float,double");
        char ch=sc.next().charAt(0);

        if(ch=='I')
		{
			System.out.println("Enter the number");
			long n1=sc.nextLong();

			if(n1>=-128 && n1<=127)
			{
				System.out.println("Byte");
				System.exit(0);
			}
			else if(n1>=-32768 && n1<=32767)
				{
				System.out.println("Short");
				System.exit(0);
			}
			else if(n1>=-2147483648 && n1<=2147483648)
				{
				System.out.println("Integer");
				System.exit(0);
			}
			else{
				System.out.println("Long");
				System.exit(0);
			}

        }
        else if(ch=='D')
        {
        	System.out.println("Enter the number");
        	Double n2=sc.nextDouble();
 
           if(n2>=1.40129846432481707*Math.exp(-45) && n2<=3.40282346638528860*Math.exp(38))
				{
				System.out.println("Float");
				System.exit(0);
			}
			else{
				System.out.println("Double");
				System.exit(0);
			}



        }
        else
        {
        	System.out.println("Invalid input");
        }
	}
}