package dev;

import com.github.lalyos.jfiglet.FigletFont;
import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        // using default font standard.flf, obtained from maven artifact
        String asciiArt1 = null;
        try {
            asciiArt1 = FigletFont.convertOneLine("hello");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(asciiArt1);
        String str = FigletFont.convertOneLine("App");
        System.out.println(str);


    }
}