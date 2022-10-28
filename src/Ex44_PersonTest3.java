public class Ex44_PersonTest3 {
    public static void main(String[] args) {
        Ex41_Person p1 = new Ex41_Person();
        p1.name = "홍길동";

       p1.printName();
       p1.printCount();

       p1.count++;

       p1.printCount();

       Ex41_Person.printCount();



    }

}
