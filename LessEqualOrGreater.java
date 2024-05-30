import java.util.Scanner;
public class LessEqualOrGreater {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a,b;
        System.out.println("enter two number");
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b)
        System.out.println(a+" is greater than "+b);
        else if(b>a)
        System.out.println(a+" is less than "+b);
        else
        System.out.println(a+" is equal to "+b);
        sc.close();
    }
}
