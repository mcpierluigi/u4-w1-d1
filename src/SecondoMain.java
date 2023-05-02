import java.util.Scanner;

public class SecondoMain {	
	 public static void writeAndConcat() {
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("write and press enter:");
		 String a = input.nextLine();
		 
		 System.out.println("write the second string:");
		 String b = input.nextLine();
		 
		 System.out.println("write the third string:");
		 String c = input.nextLine();
		 
		 String ordered = a + b + c;
		 String	reverse = c + b + a;
		 
		 System.out.println("ordered: " + ordered);
		 System.out.println("reverse: " + reverse);
	 }
	 
	 public static void main (String[] args) {
		 writeAndConcat();
	 }
}
