public class Ex43_PersonTest2 {
    public static void main(String[] args) {
        Ex41_Person p1 = new Ex41_Person();
        Ex41_Person p2 = new Ex41_Person();

        p1.name = "홍길동";
        p2.name = "조조";

        System.out.println(p1.name);
        System.out.println(p2.name);

        System.out.println(p1.count);
        p1.count++;
        System.out.println(p1.count);
        System.out.println(p2.count);

    }
}
