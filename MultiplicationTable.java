import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n,i;
        System.out.println("enter a number for multiplication table:");
        n=sc.nextInt();
        sc.close();
        for(i=1;i<=10;i++){
            System.out.println(n+" x "+i+"=" +(i*n));
        }
        
        
    }
    
    
}
