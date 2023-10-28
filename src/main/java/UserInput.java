
import java.util.InputMismatchException;
        import java.util.Scanner;

public class UserInput {
    Scanner sc = new Scanner(System.in);
    public UserInput() {
    }

    public int getNum(String str) {
        int num = 0;
        int minNum = 1;
        //int maxNum = 9;
        boolean validInput = false;
        while (!validInput) {
            System.out.print(str);
            try {
                num = sc.nextInt();
                if (num >= minNum) {
                    validInput = true;
                } else {
                    System.out.print("Wähle eine Zahl größer 0! ");
                }
            } catch (InputMismatchException e) {
                System.out.print("Wähle eine ZAHL!: ");
                sc.next();
            }
        }
        //System.out.println(num + " is a valid number.");
        return num;
    }
}
