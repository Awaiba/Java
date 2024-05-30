public class NumberFormatExceptionExample {
    @SuppressWarnings("unused")
    public static void main(String[]args)
    {
        try{
            int a=Integer.parseInt("Anish lama");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Nmber format exception");
        }
    }
}
