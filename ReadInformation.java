import java.util.Scanner;
public class ReadInformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter Name.");
        String name= sc.next();
        System.out.println("enter roll no.");
        int rollno= sc.nextInt();
        System.out.println("enter gender");
        char gender = sc.next().charAt(0);
        System.out.println("enter phon no.");
        long phno = sc.nextLong();
        System.out.println(" Name."+name);
        System.out.println(" roll no."+rollno);
        System.out.println(" gender :"+gender);
        System.out.println(" phont no."+phno);
        sc.close();
    }
}
