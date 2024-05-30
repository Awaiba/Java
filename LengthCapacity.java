public class LengthCapacity {
    
    public static void main(String[]args)
    {
        StringBuffer s=new StringBuffer("BCA 3rd Semester");
        int l=s.length();
        int c=s.capacity();
        System.out.println("Length of given string:"+l);
        System.out.println("capacity of given string:"+c);
    }

}
