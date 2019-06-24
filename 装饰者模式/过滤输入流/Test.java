package 过滤输入流;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test {

    public static void main(String[] args) {
        int c;
        try {
            InputStream is = new UpperCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
            while ((c=is.read()) != -1) {
                System.out.print((char)(c));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
