public class Ex37_MathBeanMain {
    public static void main(String[] args) {
        Ex36_MathBean mathBean = new Ex36_MathBean();

        mathBean.printClassName();
        mathBean.printNumber(10);
        int result = mathBean.getOne();
        System.out.println(result);
        int result2 = mathBean.plus(5,10);
        System.out.println(result2);

    }
}
