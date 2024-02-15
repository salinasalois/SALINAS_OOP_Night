package target;
import java.util.Scanner;
public class target {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the message: ");
        String privateMessage = scanner.nextLine();
        boolean containsMisplacedUppercase = false;

        for (int i = 1; i < privateMessage.length(); i++) {
            if (Character.isWhitespace(privateMessage.charAt(i - 1)) || !Character.isUpperCase(privateMessage.charAt(i))) {
            } else {
                containsMisplacedUppercase = true;
                break;
            }
        }
        System.out.println(containsMisplacedUppercase ? "JEJE!" : "uWu");
    }
}