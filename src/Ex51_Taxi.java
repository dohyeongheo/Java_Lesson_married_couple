public class Ex51_Taxi extends Ex49_Car {
    @Override
    public void run() {
        System.out.println("전륜 구동으로 빠르게 달린다.");
    }

    public static void main(String[] args) {
        Ex49_Car taxi = new Ex51_Taxi();
        taxi.run();
    }
}
