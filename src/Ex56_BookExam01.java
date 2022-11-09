public class Ex56_BookExam01 {
    public static void main(String[] args) {
        Ex55_Book b1 = new Ex55_Book();
        // b1.price = 100;

        b1.setPrice(100);
        b1.setTitle("즐거운 자바수업");

        System.out.println(b1.getPrice());
        System.out.println(b1.getTitle());
    }

}
