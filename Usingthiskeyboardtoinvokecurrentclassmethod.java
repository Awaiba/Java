public class Usingthiskeyboardtoinvokecurrentclassmethod {
    void display()
    {
        this.show();
        System.out.println("inside display function");
    }
    void show()
    {
        System.out.println("inside show function");
    }
    public static void main(String[] args) {
        Usingthiskeyboardtoinvokecurrentclassmethod t1 = new Usingthiskeyboardtoinvokecurrentclassmethod();
        t1.display();
    }
}
