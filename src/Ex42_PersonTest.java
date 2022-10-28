public class Ex42_PersonTest {
    public static void main(String[] args) {
        Ex41_Person person = new Ex41_Person();
        Ex41_Person person2 = new Ex41_Person();

        // 문자열은 자바에서 특수하게도 new를 사용하지 않고도 인스턴스를 생성할 수 있다.
        // 되도록 new를 사용하지 않고 큰 따옴표로 묶어서 인스턴스를 참조하는 것이 좋다.
        person.name = "홍길동";
        person2.name = "조조";


        System.out.println(person.name);
        System.out.println(person2.name);

        System.out.println(person.name.length()); // 3
        System.out.println(person.address.length()); // Exception in thread "main" java.lang.NullPointerException at Ex42_PersonTest.main(Ex42_PersonTest.java:15)


    }
}
