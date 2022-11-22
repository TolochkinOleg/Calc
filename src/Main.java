import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result = 0;

        Scanner scanner = new Scanner(System.in);
        int operand1 = scanner.nextInt();
        while (2>1) {
            char operation = scanner.next().charAt(0);
                if (operation == 's') {
                    break;
                } else if (operation == 'c') {
                    result = 0;
                    System.out.println(result);
                    continue;
                }
            int operand2 = scanner.nextInt();
                switch (operation) {
                    case '+':
                        result = operand1 + operand2;
                        break;
                    case '-':
                        result = operand1 - operand2;
                        break;
                    case '*':
                        result = operand1 * operand2;
                        break;
                    case '/':
                        result = operand1 / operand2;
                        break;
                    default:
                        System.out.println("Mistake");
                }

            System.out.println(result);
            operand1 = result;
        }
    }
}

