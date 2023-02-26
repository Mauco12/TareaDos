import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena de caracteres: ");
        String inputString = scanner.nextLine();
        boolean isConsecutive = true;
        if (inputString.length() == 0 || inputString.length() == 1) {
            isConsecutive = false;
        } else {
            char[] charArray = inputString.toCharArray();
            for (int i = 1; i < charArray.length; i ++) {
                if ((int)charArray[i] - (int)charArray[i-1] !=1){
                    isConsecutive = false;
                    break;
                }
            }
        }
        if (isConsecutive) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

