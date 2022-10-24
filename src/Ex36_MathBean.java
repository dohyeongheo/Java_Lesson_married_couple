public class Ex36_MathBean {

    public void printClassName()

    {
        // 클래스 이름을 화면에 출력한다.
        String className = this.getClass().getSimpleName();
        System.out.println(className);
    }

    ;

    public void printNumber(int x) {
        // 매개 변수로 받아들인 정수를 화면에 출력한다.
        System.out.println(x);
    }

    ;

    public int getOne() {
        // 숫자 x를 리턴한다
        return 1;
    }

    public int plus(int x, int y) {
        // 매개변수로 정수 2개를 받아들인 후, 그 합을 리턴한다.
        int result = x + y;
        return result;
    }


}
