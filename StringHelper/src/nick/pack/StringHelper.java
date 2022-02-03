package nick.pack;

public class StringHelper {
    public static String multiply(String str, int count){
        String newStr= str.repeat(count);
        return newStr;
    }
    public static String multiply(String str){
        String newStr = str.repeat(5);
        return newStr;
    }
}
