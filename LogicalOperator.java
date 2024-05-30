import java.util.Scanner;
public class LogicalOperator {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter three number:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println("a>b&&a>c is "+ (a>b&&a>c));
        System.out.println("a>b||a>c is "+ (a>b||a>c));
        System.out.println("!(a>b) is "+ !(a>b));
        sc.close();
    }
}
