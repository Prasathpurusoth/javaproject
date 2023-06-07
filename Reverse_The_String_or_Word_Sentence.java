import java.util.Scanner;

public class reverseString {
	public static void main(String[] args) {
		String x = "";
		System.out.print("Enter the word you want to reverse =");
		Scanner a = new Scanner(System.in);
		String b = a.nextLine();
		char c[] = b.toCharArray();
		System.out.print("The reverse word is =");
		for (int i = b.length() - 1; i >= 0; i--) {
			x = x + c[i];
		}
		System.out.println(x);	
	}
}
