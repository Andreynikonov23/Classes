package nick.pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите операцию:");
        System.out.println("    1. Сумма");
        System.out.println("    2. Разность");
        System.out.println("    3. Умножение");
        System.out.println("    4. Деление");
        System.out.println("    5. Процент от числа");
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        String str = scanner.readLine();
        if (str.equalsIgnoreCase("Сумма")){
            System.out.println("Введите число a:");
            int a = Integer.parseInt(scanner.readLine());
            System.out.println("Введите число b:");
            int b = Integer.parseInt(scanner.readLine());
            System.out.println(Calculator.plus(a,b));
        }
        if (str.equalsIgnoreCase("Разность")){
            System.out.println("Введите число a:");
            int a = Integer.parseInt(scanner.readLine());
            System.out.println("Введите число b:");
            int b = Integer.parseInt(scanner.readLine());
            System.out.println(Calculator.minus(a, b));
        }
        if (str.equalsIgnoreCase("Умножение")){
            System.out.println("Введите число a:");
            int a = Integer.parseInt(scanner.readLine());
            System.out.println("Введите число b:");
            int b = Integer.parseInt(scanner.readLine());
            System.out.println(Calculator.multiply(a, b));
        }
        if (str.equalsIgnoreCase("Деление")){
            System.out.println("Введите число a:");
            int a = Integer.parseInt(scanner.readLine());
            System.out.println("Введите число b:");
            int b = Integer.parseInt(scanner.readLine());
            System.out.println(Calculator.division(a, b));
        }
        if (str.equalsIgnoreCase("Процент от числа")){
            System.out.println("Введите число:");
            int a = Integer.parseInt(scanner.readLine());
            System.out.println("Введите процент от числа:");
            int b = Integer.parseInt(scanner.readLine());
            System.out.println(Calculator.percent(a, b));
        }
    }
}
