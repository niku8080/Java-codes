import java.io.*;
class Demo18{
	public static void main(String [] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String name =  br.readLine();
		System.out.println(name);
	}
}
