import java.util.*; 
class Demo9{
	 public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num1 : ");
		int num1 =sc.nextInt();
		System.out.print("Enter the num2 : ");
		int num2 =sc.nextInt();
		
		if(num1>=num2){
			for(int i=num2;i<=num1;i++){
				if(i%2==0){
					System.out.print(i+",");
				}
			} 
		}else {
			for(int i=num1;i<=num2;i++){
				if(i%2==0){
					System.out.print(i+",");
				}
			}
		}
		System.out.println();
	}
}
