package by.homefolder.javabook1.lessons.SeaBattleTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;

public class GameHelper {
    String getUserInput(String usGuesss) {
        String inputLine = null;
        System.out.print(usGuesss + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) {
                return null;
            }
        } catch (IOException e) {
            System.out.println("IOException " + e);
        }
        return inputLine;

    }
}
