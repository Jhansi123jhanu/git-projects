package pro;
import java.util.Scanner;
public class Cbsc {
     public static void main(String[] args) {
        
    
    Scanner s=new Scanner(System.in);
    System.out.println("enter maths  marks");
    int a=s.nextInt();
    System.out.println("enter physics  marks");
    int b=s.nextInt();
    System.out.println("enter english marks");
    int c=s.nextInt();
    System.out.println("enter science  marks");
    int d=s.nextInt();
    System.out.println("enter social  marks");
    int e=s.nextInt();
    System.out.println("enter hindi  marks");
    int f=s.nextInt();
    int sum=a+b+c+d+e+f;
    System.out.println(sum);
    float pr=(sum/600.0f)*100;
   System.out.println(pr);
}
}