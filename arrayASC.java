import java.util.*;


public class arrayASC
{
	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter array size");
		int n=sc.nextInt();

		int min=0;

		int arr[]=new int[n];

        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

         for (int i=0; i<n; i++) 
         {     
            for (int j=i+1; j<n; j++) 
            {     
               if(arr[i] > arr[j]) 
               {    
                   min = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = min;    
               }     
            }     
        }   


        System.out.println("Array arranged in ascending order is: ");
        for(int i=0;i<n;i++)
        {
        	System.out.println(arr[i] + " ");
            
        } 


	}
}