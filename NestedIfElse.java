import java.util.Scanner;
public class NestedIfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a,b,c;
        System.out.println("enter three numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b){
            if(a>c)
            System.out.println(a+" is greatest");
        }
        if(b>a){
            if(b>c)
            System.out.println(b+" is greatest");
        }
        if(c>a){
            if(c>b)
            System.out.println(c+" is greatest");
        }
        else
        System.out.println("enter numbers with different values");
        sc.close();

    }
    
}
