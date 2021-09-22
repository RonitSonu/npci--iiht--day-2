import java.util.*;

class day2A4{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter no of rows");
		int row=sc.nextInt();

		System.out.println("Enter no of cols");
		int col = sc.nextInt();

		int Ar[][]=new int[row][col];
		int Br[][]=new int [row][col];
		int Cr[][]=new int [row][col];
		int Dr[][]=new int [row][col];

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

				if(Ar[i][j]==Br[i][j])
				{
                     Cr[i][j]=0;
				}
				else
				{
                     Cr[i][j]=Ar[i][j];
				}
				
			}
		}

		for(int i=0;i<row;i++)
		{
			for (int j=0;j<col ;j++ ) {

				if(Ar[i][j]==Br[i][j])
				{
                     Dr[i][j]=0;
				}
				else
				{
                     Dr[i][j]=Br[i][j];
				}
				
			}
		}

		System.out.println("Result 1: ");
		for (int i=0;i<row ;i++ ) {
			for (int j=0;j<col ;j++ ) {
				System.out.print(Cr[i][j]+"\t");
		
				
			}
			System.out.println();
			
		}
		System.out.println();

		System.out.println("Result 2: ");
		for (int i=0;i<row ;i++ ) {
			for (int j=0;j<col ;j++ ) {
				System.out.print(Dr[i][j]+"\t");
		
				
			}
			System.out.println();
			
		}

	}
}