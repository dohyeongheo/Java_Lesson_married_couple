public class Ex35_VendingMachineMain {
    public static void main(String[] args) {
        Ex34_OOP_VendingMachine vm1 = new Ex34_OOP_VendingMachine();
        Ex34_OOP_VendingMachine vm2 = new Ex34_OOP_VendingMachine();

        // System.out.println(vm1.pushProductButton(1));
        String product = vm1.pushProductButton(1);
        System.out.println(product);

//        Ex34_OOP_VendingMachine.printVersion();
//        vm1.printVersion();

        String product2 = vm2.pushProductButton(200);
        System.out.println(product2);


    }
}
