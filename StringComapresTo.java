public class StringComapresTo {
    
    @SuppressWarnings("unused")
    public static void main(String[]args)
    {
        String s1= "Michal";
        String s2= "JohnCena";
        String s3= "Avisarika";
        String s4= "Kashis";
        String s5= "michal";
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s3));        
        System.out.println(s1.compareTo(s5));
        System.out.println(s1.compareToIgnoreCase(s5));
    }
}
