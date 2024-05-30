import java.util.Scanner;
public class ExampleSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int choice;
        System.out.println("Enter a day of the week:");
        choice=sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednsday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("friday");
                break;            
            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("wrong input");
        }
        sc.close();
    }
    
}
