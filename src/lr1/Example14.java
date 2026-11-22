package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // считываем введенное число
        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        // вычисляем первые три числа
        int num1 = n - 1;
        int num2 = n;
        int num3 = n + 1;

        // сумма первых трех чисел
        int sum = num1 + num2 + num3;

        // четвертое число — квадрат суммы
        int num4 = sum * sum; // или Math.pow(sum, 2), но приведение типов сделает код длиннее

        // выводим последовательность
        System.out.println("Результат: " + num1 + " " + num2 + " " + num3 + " " + num4);

        scanner.close();
    }
}