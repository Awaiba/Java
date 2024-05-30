public class StaticVariables {
    int rollno;
    String name;
    static String subject="jo mama fat";
    StaticVariables(int r, String n)
    {
        rollno= r;
        name=n;
    }
    void display()
    {
        System.out.println("\nRoll no :"+rollno);
        System.out.println("\nName :"+name);
        System.out.println("\nSubject :"+subject);
    }
    public static void main(String[] args) {
        StaticVariables obj1=new StaticVariables(1, "Osama");
        StaticVariables obj2=new StaticVariables(2, "Saddam");
        obj1.display();
        obj2.display();
    }
}
