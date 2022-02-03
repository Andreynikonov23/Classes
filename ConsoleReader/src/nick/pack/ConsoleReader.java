package nick.pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static String readString() throws IOException {
        System.out.println("Введите строковое значение");
        String string = reader.readLine();
        return string;
    }
    public static int intReader() throws IOException {
        System.out.println("Введите целочисленное число");
        int num = Integer.parseInt(reader.readLine());
        return num;
    }
    public static double doubleReader() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите вещественное число");
        double f = Double.parseDouble(reader.readLine());
        return f;
    }
    public static boolean booleanReader() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите true или false");
        boolean b = Boolean.parseBoolean(reader.readLine());
        return b;
    }
}
