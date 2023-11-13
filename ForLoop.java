import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Get the average using for loop");

        double dsum = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter a number: ");
            int iNumber = scanner.nextInt();

            dsum = dsum + iNumber;
        }

        // to get the average
        double iSum =  dsum / 4; 
        System.out.println("Average of numbers: " + iSum);
        

    }
}