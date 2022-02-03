package nick.pack;

import java.util.Scanner;

public class Main {
    /*
    Индекс массы тела = вес в кг / (рост в метрах * рост в метрах)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш вес");
        double weight = scanner.nextDouble();
        System.out.println("Введите ваш рост в метрах (Прим.: 1,68)");
        double height = scanner.nextDouble();
        Body.calculateMassIndex(weight, height);
    }
    public static class Body {

        public static void calculateMassIndex(double weight, double height){
            double index = weight / (height * height);
            System.out.println("Ваш индекс: " + index);
            if (index < 18.5){
                System.out.println("Недовес: мешьше чем 18.5");
            }
            if (index >= 18.5 && index < 25){
                System.out.println("Нормальный: между 18.5 и 25");
            }
            if (index >= 25 && index < 50){
                System.out.println("Избыточный: между 25 и 30");
            }
            if (index >= 30){
                System.out.println("Ожирение: 30 и более");
            }
        }
    }
}
