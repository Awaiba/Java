public class UnboxingExample {
    public static void main(String[] args) {
        Integer a= Integer.valueOf(3);
        Integer i=a.intValue();
        int j=a;
        System.out.println(a+" "+i+" "+j);
    }
}
