import java.util.*; 
class Demo7{
	 public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num =sc.nextInt();

		for(int i =10;i>=1;i--){
			System.out.print(i*num +",");
		}	
		System.out.println();
	}
}
