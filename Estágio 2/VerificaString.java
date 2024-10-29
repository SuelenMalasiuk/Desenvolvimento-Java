import java.util.Scanner;

public class FibonacciChecker {

    public static boolean isFibonacci(int num) {
        if (num == 0 || num == 1) {
            return true;  // 0 e 1 fazem parte da sequência
        }

        int a = 0;
        int b = 1;
        int next = a + b;

        while (next <= num) {
            if (next == num) {
                return true;  
            }
            a = b;
            b = next;
            next = a + b;
        }

        return false; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe u  núero para verificação: ");
        int number = scanner.nextInt();

        if (isFibonacci(number)) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + number + " não pertence à sequência de Fibonacci.");
        }
        
        scanner.close();
    }
}
