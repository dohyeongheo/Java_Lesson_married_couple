public class Ex45_Hello {
    static int i;
    static {
        i = 500;
        System.out.println("static block"); // 원래는 static field를 초기화한다.
        System.out.println(i);

    }
    public static void main(String[] args) {
        System.out.println("Hello");

    }

}
