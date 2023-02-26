import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena de caracteres: ");
        String inputString = scanner.nextLine();
        boolean isConsecutive = true;

        // check if the string is empty or has only one character
        if (inputString.length() == 0 || inputString.length() == 1) {
            isConsecutive = false;
        } else {
            // convert the string to a char away
            char[] charArray = inputString.toCharArray();

            //check if each character is consecutive with the previous one
            for (int i = 1; i < charArray.length; i ++) {
                if ((int)charArray[i] - (int)charArray[i-1] !=1){
                    isConsecutive = false;
                    break;
                }
            }
        }

        // print the result
        if (isConsecutive) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

