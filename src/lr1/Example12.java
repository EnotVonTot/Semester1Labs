package lr1;

import java.util.Scanner;
import java.time.Year;

public class Example12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // считываем возраст
        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();

        // узнаем текущий год
        int currentYear = Year.now().getValue();

        // вычисляем год рождения
        int birthYear = currentYear - age;

        // выводим результат
        System.out.println("Ваш год рождения: " + birthYear + " (если день рождения в этом году еще не прошел, то " + (birthYear - 1) + ").");

        scanner.close();
    }
}