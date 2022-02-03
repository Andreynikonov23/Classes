package nick.pack;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println(ConsoleReader.readString());
        System.out.println(ConsoleReader.intReader());
        System.out.println(ConsoleReader.doubleReader());
        System.out.println(ConsoleReader.booleanReader());
    }
}
