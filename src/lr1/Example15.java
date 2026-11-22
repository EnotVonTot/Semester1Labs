package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  первое число
        System.out.print("введите первое число: ");
        int num1 = scanner.nextInt();

        //  второе число
        System.out.print("введите второе число: ");
        int num2 = scanner.nextInt();

        // вычисления
        int sum = num1 + num2;
        int diff = num1 - num2;

        // вывод результатов
        System.out.println("сумма чисел: " + sum);
        System.out.println("разность: " + diff);

        scanner.close();
    }
}