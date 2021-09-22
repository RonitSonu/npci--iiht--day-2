import java.util.*;

class day2A3{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter no of rows");
		int row=sc.nextInt();

		System.out.println("Enter no of cols");
		int col = sc.nextInt();

		int Ar[][]=new int[row][col];
		int Br[][]=new int [row][col];

		System.out.println("Enter elements of array 1");
		for (int i=0;i<row ;i++ ) {
			for (int j=0;j<col ;j++ ) {
				Ar[i][j]=sc.nextInt();
				
			}
			
		}

		System.out.println("Enter elements of array 2");
		for (int i=0;i<row ;i++ ) {
			for (int j=0;j<col ;j++ ) {
				Br[i][j]=sc.nextInt();
				
			}
			
		}

		for(int i=0;i<row;i++)
		{
			for (int j=0;j<col ;j++ ) {

				Ar[i][j]=Ar[i][j]+Br[i][j];
				
			}
		}

		System.out.println("Array after addition is");
		for (int i=0;i<row ;i++ ) {
			for (int j=0;j<col ;j++ ) {
				System.out.println(Ar[i][j]+"\t");
		
				
			}
			System.out.println();
			
		}

	}
}