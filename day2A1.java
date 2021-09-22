import java.util.*;

class day2A1{
	public static void main(String[] args) {
		
		//Scanner sc=new Scanner(System.in);

		int count=1;
		int a[][]=new int[2][3];

		for(int i=0;i<1;i++){
			for(int j=0;j<3;j++){
				a[i][j]=count;
				count++;
			}
		}

		count=6;

		for(int i=1;i<2;i++){
			for(int j=0;j<3;j++){
				a[i][j]=count;
				count--;
			}
		}

		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}




	}
}