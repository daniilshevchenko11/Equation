import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("ax^2+bx+c=0");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a");
        double a = input.nextDouble();
        System.out.print("Enter b");
        double b = input.nextDouble();
        System.out.print("Enter c");
        double c = input.nextDouble();
        double D = b*b-4*a*c;
        if (D>0){
            double x1 = (-b+Math.sqrt(D))/(2*a);
            double x2 = (-b-Math.sqrt(D))/(2*a);
            System.out.println("x1="+x1+" and x2="+x2);
        }
        else if (D==0){
            double x0 = -b/(2*a);
            System.out.println("x="+x0);
        }
        else{
            System.out.println("No solutions");
        }
    }
}