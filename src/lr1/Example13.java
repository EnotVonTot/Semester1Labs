package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // запрашиваем первое число
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        // запрашиваем второе число
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        // вычисляем сумму с помощью оператора +
        int sum = num1 + num2;

        // выводим результат
        System.out.println("Сумма чисел: " + sum);

        scanner.close();
    }
}