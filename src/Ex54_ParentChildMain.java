public class Ex54_ParentChildMain {
    public static void main(String[] args) {
        Ex53_Child c1 = new Ex53_Child();
        // 참조 타입이 Child, 인스턴스도 Child
        // c1.i의 값과 c1.printI()메소드가 출력된 값은 모두 15가 된다.
        System.out.println(c1.i); // 15
        c1.printI(); // child - printI() : 15

        System.out.println("-----------------------");

        Ex52_Parent p1 = new Ex52_Parent();
        System.out.println(p1.i); // 5
        p1.printI(); // parent - printI() : 5

        System.out.println("-----------------------");

        Ex52_Parent p2 = new Ex53_Child();
        // 참조 타입이 Parent, 인스턴스는 Child
        // 오류가 발생하지 않는 이유는 Child가 Parent의 후손, 자식이기 때문
        System.out.println(p2.i); // 5
        p2.printI();//  child - printI() : 15
        p2.printII(); // 10
        // 메소드는 오버라이딩이 되면 무조건 자식의 메소드가 실행이 된다.
        // Parent 타입으로 참조하지만 메소드는 오버라이딩 되었기 때문에
        // 자식의 printI()메소드가 실행되고 자식의 printI()메소드는 자식의 i값을
        // 출력해서 15가 출력이 된다.

        System.out.println("-----------------------");

        Ex53_Child p3 = (Ex53_Child) p2;

        System.out.println(p3.i); // 15
        p3.printI(); // child - printI() : 15


    }
}
