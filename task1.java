import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        comparsion(num1, num2);
        sum(num1, num2);
        subtraction(num1, num2);
        multiply(num1, num2);
        divide(num1, num2);
    }

    public static void comparsion (int num1, int num2) {
        if (num1 < num2) {
            System.out.println(num1 + " < " + num2);
        } else if (num1 > num2) {
            System.out.println(num1 + " > " + num2);
        }   else {
            System.out.println(num1 + " = " + num2);
        }
    }

    public static void sum (int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Сложение: " + sum);
    }

    public static void subtraction (int num1, int num2) {
        int sub = num1 - num2;
        System.out.println("Вычитание: " + sub);
    }

    public static void multiply (int num1, int num2) {
        int mult = num1 * num2;
        System.out.println("Умножение: " + mult);
    }

    public static void divide (int num1, int num2) {
        if (num2 != 0) {
            int div = num1 / num2;
            System.out.println("Деление: " + div);
        } else {
            System.out.println("Деление на ноль.");
        }
    }
}