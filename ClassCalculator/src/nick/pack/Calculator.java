package nick.pack;

public class Calculator {
    public static int plus(int a, int b){
        int res = a + b;
        return res;
    }
    public static int minus(int a, int b){
        int res = a - b;
        return res;
    }
    public static int multiply(int a, int b){
        int res = a*b;
        return res;
    }
    public static double division(double a, double b){
        double res = a / b;
        return res;
    }
    public static double percent(double a, double b){
        double res = a/100 * b;
        return res;
    }
}
