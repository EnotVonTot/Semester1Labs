package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // день недели
        System.out.print("Введите день недели: ");
        String dayOfWeek = scanner.nextLine();

        // название месяца
        System.out.print("Введите месяц: ");
        String month = scanner.nextLine();

        // дата
        System.out.print("Введите номер дня в месяце: ");
        int date = scanner.nextInt();

        // результат
        System.out.println("Сегодня " + dayOfWeek + ", " + date + " " + month + ".");

        scanner.close();
    }
}