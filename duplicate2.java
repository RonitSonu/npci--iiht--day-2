import java.util.*;

public class duplicate2
{
   public static void search(int arr[], int num)
	{

        int len = arr.length;
		int i = 0;

		while (i<len) 
		{
			if (arr[i] == num) {
				System.out.println(i + " , ");
			}
			else {
				i = i + 1;
			}
		}
		
	}


	public static void main(String[] args)
	{
		int arr[]={1,5,5,8,9};
         search(arr, 5);

	}
}
