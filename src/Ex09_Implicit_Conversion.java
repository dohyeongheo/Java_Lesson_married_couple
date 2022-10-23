public class Ex09_Implicit_Conversion {
    public static void main(String[] args) {
        double d1 = 50;
        double d2 = 500L;

        System.out.println(d1);
        System.out.println(d2);

//        int i1= 50.0;
//        int i2 = 25.4f;

        int i1= (int)50.0;
        int i2 = (int)25.6f;

        System.out.println(i1);
        System.out.println(i2);

        short s = 5;
        int i = s;
        long x = i;

        System.out.println(i);
        System.out.println(x);
    }
}
