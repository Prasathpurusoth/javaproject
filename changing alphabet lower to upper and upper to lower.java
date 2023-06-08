import java.util.Scanner;
public class changingchar {

	public static void main(String[] args) {
		char c;
		System.out.println("Enter the changing alphabet :");
		Scanner m=new Scanner(System.in);
		char d=m.next().charAt(0);  
		int a= d;
		System.out.println("ASCII value of "+d+" is "+a);
		System.out.println("The changing case of given is ");
		if(a<96) {
			a=a+32;
			c=(char)a;
			System.out.print(c);
		}else if(a>=90) {
			a=a-32;
			c=(char)a;
			System.out.print(c);
		}
	}

}
