import java.util.Scanner;
class Main
{
   public static void main(String[] args)
   {
      Scanner a=new Scanner(System.in);
      
      int n=a.nextInt(),sum=0,d;
      while(n>0){
          d=n%10;
          sum=sum+d;
          n=n/10;
      }
      System.out.println(sum);
   }
}