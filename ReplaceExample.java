public class ReplaceExample {
    
    public static void main(String[]args)
    {
        StringBuffer s=new StringBuffer("BCA 3rd Semester");
        System.out.println(s);
        s.replace(3,1,"Red Ranger");
        System.out.println(s);
    }

}
