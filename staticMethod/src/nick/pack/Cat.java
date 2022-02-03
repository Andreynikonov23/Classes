package nick.pack;

public class Cat {
    public static int catCount;


    public static int getCatCount(){
        return catCount;
    }
    public static void setCatCount(int count){
        catCount = count;
        catCount++;
    }
}
