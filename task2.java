import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String line1 = scanner.nextLine();
        System.out.print("Введите вторую строку: ");
        String line2 = scanner.nextLine();
        if (line1.equals(line2)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки не идентичны");
        }
    }
}