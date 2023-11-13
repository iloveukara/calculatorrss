import java.util.Scanner;
public class LabExer1B {
    int a;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LabExer1B oop = new LabExer1B();
        

        System.out.print("Enter an integer: ");
        oop.a = scanner.nextInt();

        oop.showNumberPlus10();
        oop.showNumberPlus100();
        oop.showNumberPlus1000();
        
    }
    public void showNumberPlus10() {
        int plusTen = a + 10;
        System.out.println(a + " plus 10 is " + plusTen);
    }
    public void showNumberPlus100() {
        int plusHundred = a + 100;
        System.out.println(a + " plus 10 is " + plusHundred);
    }
    public void showNumberPlus1000() {
        int plusThou = a + 1000;
        System.out.println(a + " plus 10 is " + plusThou);
    }
}