class Root{
    Root(int x){
        System.out.println("x= "+x);
    }
}
public class SubClass extends Root{
     SubClass(int m,int n)
     {
        super(m);
        System.out.println("y="+n);

     }
     @SuppressWarnings("unused")
    public static void main(String[] args) {
        SubClass s = new SubClass(5,10);
     }
}