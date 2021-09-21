import java.util.*;

class A1{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		int square,multiple;

        System.out.println("Enter 1st number");
        int num1=sc.nextInt();

        if(num1%2==0)
        {
             System.out.println("Enter next number");
             square=sc.nextInt();

             if(square(square,num1))
             {
             	if(multiple(square,num1))
             	{
             		System.out.println(square+ " is a square & multiple of "+num1);
             	}
             }
             else if(multiple(square,num1))
             	{
             		int count=multiple_count(square,num1);
             		System.out.println(square+ " is a multiple of "+num1+" = "+count+"s of"+num1);
             	}
             	else{
             		System.out.println(square+" is neither a square nor a multiple of "+num1);
             	}

             

        }
        else
        {
        	System.out.println("The first inputted no. is not even! Exiting.");
        }


        //functions

boolean square(int x,int y)
{
	if(x/y==y)
		return true;
}

 boolean multiple(int x,int y)
{
	if(x%y==0)
		return true;
}

 int multiple_count(int x,int y)
{
	int count=0;

	while(x>0)
	{
         x=x/y;
         count++;
	}
	return count;
}


	}
}

