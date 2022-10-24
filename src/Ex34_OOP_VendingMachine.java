public class Ex34_OOP_VendingMachine {

    // field (가지는 것들)
    int menuId;

    // constructor (생성자)

    // method (기능)
    public String pushProductButton(int menuId) {
      String result = "";
      if (menuId == 1) {
          result = "콜라";
      } else if (menuId == 2) {
          result = "사이다";
      } else if (menuId == 3) {
          result = "환타";
      } return result;
    };

}
