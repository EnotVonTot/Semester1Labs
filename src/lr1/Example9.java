package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // месяц
        System.out.print("Введите название месяца: ");
        String month = scanner.nextLine();

        // кол-во дней
        System.out.print("Введите количество дней в этом месяце: ");
        int days = scanner.nextInt();

        // сообщение
        System.out.println("Месяц " + month + " содержит " + days + " дней.");

        scanner.close();
    }
}