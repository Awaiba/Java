public class multipleCatchBlock {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            a[2]=6/0;
            System.out.println(a[2]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide by zero exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBound exception occurs");
        }
    }
}
