public class Ex48_Bus extends Ex49_Car {
    public  void run() {
        System.out.println("후륜 구동으로 달린다.");
    }

    public void 안내방송() {
        System.out.println("마스크를 착용하시고 승차해주세요.");
    }

    public static void main(String[] args) {
        Ex48_Bus bus = new Ex48_Bus();
        bus.run();
        bus.안내방송();

        Ex49_Car c1  = new Ex48_Bus();
        c1.run();

        Ex48_Bus b2 = (Ex48_Bus)c1;
        b2.안내방송();
//        c1.안내방송();

    }
}
