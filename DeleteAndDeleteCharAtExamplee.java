public class DeleteAndDeleteCharAtExamplee {
    
    public static void main(String[]args)
    {
        StringBuffer s=new StringBuffer("BCA 3rd Semester");
        System.out.println(s);
        s.delete(1,4);
        System.out.println(s);
        StringBuffer str=new StringBuffer("Doremonnnn");
        str.deleteCharAt(5);
        System.out.println(str);
    }
}
