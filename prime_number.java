import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) {
		int count=0;
		System.out.print("Enter the number = ");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		for(int i = 0; a<=1 ; a++) {
			if(a%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Given number is prime number are "+a);
		
	}else {
            System.out.println("TGiven number is not prime number are "+a);
}
}
}

