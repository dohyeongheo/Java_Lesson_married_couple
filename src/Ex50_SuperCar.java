public class Ex50_SuperCar extends Ex49_Car {

    public void run() {
        System.out.println("사륜 구동으로 달린다.");
    }

    public static void main(String[] args) {

        Ex49_Car supercar = new Ex50_SuperCar();
        supercar.run();
    }

}
