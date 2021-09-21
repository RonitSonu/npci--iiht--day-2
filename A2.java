import java.util.*;

class A2{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter number");
		int num=sc.nextInt();

		int count=0;

	    while(num>0)
	    {
           num=num/10;
           count++;
	    }
	    System.out.println(count);


	    //Conditionals
        if(count%2==0 && count%3==0)
        {
        	
             if(count%2==0)
	           {
	    	     System.out.println("Result = "+ count+","+count*count);
	    	     System.exit(0);
	           }
	         else if(count%3==0)
	          {
	    	    System.out.println("Result = "+ count+","+count*count*count);
	    	    System.exit(0);
	          }
	     
        }
        else if(count%2==0)
	           {
	    	     System.out.println("Result = "+ count+","+count*count);
	    	     System.exit(0);
	           }
	           else if(count%3==0)
	          {
	    	    System.out.println("Result = "+ count+","+count*count*count);
	    	    System.exit(0);
	          }
	          else if(num%2!=0)
	          {
	          	count=count-1;
	          	System.out.println("Result = "+ count+","+count*count);
	    	     System.exit(0);
	          }
	          else if(num<2)
	          {
	          	System.out.println(num);
	          }
	          else
	          {
	          	System.out.println("Invalid input");
	          }

	    
	    
	}
}