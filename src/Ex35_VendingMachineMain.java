public class Ex35_VendingMachineMain {
    public static void main(String[] args) {
        Ex34_OOP_VendingMachine vm1 = new Ex34_OOP_VendingMachine();

        // System.out.println(vm1.pushProductButton(1));
        String product = vm1.pushProductButton(1);
        System.out.println(product);

    }
}
