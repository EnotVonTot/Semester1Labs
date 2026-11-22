package timus.task_1293;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // считываем N, A и B.
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // общая площадь: N панелей * площадь одной стороны * 2 стороны
        int totalSulfide = n * a * b * 2;

        // результат
        System.out.println(totalSulfide);

        scanner.close();
    }
}