import java.util.*;
class Demo15{
	public static void main(String [] args ){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int row =sc.nextInt();
		for(int i=1;i<=row;i++){
			int num =i;
			for(int j=1;j<=i;j++){
				System.out.print(num-- +" " );
			}
			System.out.println();
		}
	}
}
