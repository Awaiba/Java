public class StringLength {
    
    public static void main(String[]args)
    {
        String s1= "Object oriented program in java";
        String s2= "badaboom";
        String s3= "Avisar ig a good boy";
        String s4= "Kashi khalto ma khasyo";
        String s5= "object oriented program in java";
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));        
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s5));
    }
}
