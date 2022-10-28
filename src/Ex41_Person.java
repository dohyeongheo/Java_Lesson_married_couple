public class Ex41_Person {
    String name; // 인스턴스 필드 (static이 붙어 있지 않음)
    String address;
    boolean isVip;
    static int count = 0; // 클래스 필드
    static {
        count = 100; // 클래스 필드는 static 블록에서 초기화 할 수 있다.

    }

    public void printName() { // 인스턴스 메소드
        System.out.println("내 이름은 " + name);
    }

    public static void printCount() { // 클래스 메소드
        // System.out.println(name); // static 한 메소드에서는 인스턴스 필드를 사용할 수 없다.
        System.out.println("count : " + count);
    }
}
