import java.util.Scanner;

public class Main
{
    public static void main(String[]args)
    {
        int c;
        System.out.println("Enter the wanted table=");
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        System.out.println("Enter the range of the table=");
        Scanner io=new Scanner(System.in);
        int b=io.nextInt();
        for(int i=1;i<=b;i++) 
        {
          c=i*a;
          System.out.println(a+"X"+i+"="+c);  
        }
        
    }
}