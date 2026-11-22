package lr1;

import java.util.Scanner;
import java.time.Year; //  класс для работы с годом

public class Example10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // получаем текущий год
        int currentYear = Year.now().getValue();

        // запрашиваем год рождения
        System.out.print("Введите год вашего рождения: ");
        int birthYear = scanner.nextInt();

        // вычисляем возраст
        int age = currentYear - birthYear;

        // выводим результат
        System.out.println("Ваш возраст: " + age + " лет");

        scanner.close();
    }
}