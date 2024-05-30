import java.util.Scanner;
public class ScannerExample {
    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("NAME: ");
        String name=sc.next();
        System.out.println("Gender : ");
        char gender =sc.next().charAt(0);
        System.out.println("AGE: ");
        int age=sc.nextInt();
        System.out.println("MOBILE : ");
        long  mobile =sc.nextLong();
        System.out.println("GPA: ");
        double  gpa=sc.nextDouble();
        System.out.println("\n Name: "+name);
        System.out.println("Gender :"+gender);
        System.out.println("Age :"+age);
        System.out.println("Mobile no :"+mobile);
        System.out.println("GPA :"+gpa);

    }
}