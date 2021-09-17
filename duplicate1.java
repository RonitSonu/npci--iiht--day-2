import java.util.*;

public class duplicate1 
{
   public static int search(int arr[], int num)
	{

        int len = arr.length;
		int i = 0;

		while (i<len) 
		{
			if (arr[i] == num) {
				return i;
			}
			else {
				i = i + 1;
			}
		}
		return -1;
	}


	public static void main(String[] args)
	{
		int arr[]={1,5,5,8,9};
        System.out.println("Position of 5 is"+ search(arr, 5));

	}
}
