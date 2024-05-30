public class NullPointerExceptionExample {
    @SuppressWarnings("null")
    public static void main (String[]args)
    {
        try{
            NullPointerExceptionExample obj=null;
            System.out.println(obj.toString());
        }
        catch(NullPointerException e)
        {
            System.out.println("Null pointer exception");
        }
    }
}
