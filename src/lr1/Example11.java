package lr1;

import java.util.Scanner;
import java.time.Year;

public class Example11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // считываем имя (текст)
        System.out.print("Введите Ваше имя: ");
        String name = scanner.nextLine();

        // считываем год рождения (число)
        System.out.print("Введите свой год рождения: ");
        int birthYear = scanner.nextInt();

        // узнаем текущий год и вычисляем возраст
        int currentYear = Year.now().getValue();
        int age = currentYear - birthYear;

        // выводим результат
        System.out.println(name + ", Ваш возраст: " + age );

        scanner.close();
    }
}