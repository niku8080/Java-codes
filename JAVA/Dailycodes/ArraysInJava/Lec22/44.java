import java.util.*;
class Demo44{
	public static void main(String [] args ){
		Scanner sc = new Scanner (System.in);
		System.out.print("players : ");
		String info = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(info,",");	
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}	
	}
}
