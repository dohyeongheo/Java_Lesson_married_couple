public class Ex53_Child extends Ex52_Parent{

    public int i = 15; // 필드에 대한 오버라이딩

    @Override
    public void printI() { // 메소드에 대한 오버라이딩
        System.out.println("child - printI() : " + i);
    }
}
