import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int n;
        System.out.println("enter a number:");
        n=sc.nextInt();
        if(n%2==0)
        System.out.println(n +" is even");
        else
        System.out.println(n +" is odd");
        sc.close();
    }
}
