package test;

public class testSwitch {

  public static void main(String[] args){
    String n = null;
    switchTest(n);
  }

  private static void switchTest(String n){
    int test = 0;
    switch (n){
      case "1":
        System.out.println(n);
        break;
      case "2":
        System.out.println(n);
        break;
      case "3":
        System.out.println(n);
        break;
        default:
          System.out.println("default");
    }
  }

}
