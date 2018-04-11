import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Zorian Fedoryga on 11.04.2018.
 */
public class Main {


    public static void main(String[] args) throws IOException {

        String testLine = "Java test";
        System.out.println("Reverse line process: " + reverseLine(testLine));


        int x = 15;
        int y = -3;
        System.out.println("Add two int numbers without arithmetic operations process: " + addNumbers(x, y));

        String filePath = "test.txt";
        System.out.println("Read file: " +  readFile(filePath));
    }

    private static String reverseLine(String line) {
        String result = null;
        try {
            StringBuffer stringBuffer = new StringBuffer();
            char[] lineCharacters = line.toCharArray();
            for (int i = lineCharacters.length - 1; i >= 0; i--) {
                stringBuffer.append(lineCharacters[i]);
            }
            result = stringBuffer.toString();
        } catch (Exception e) {
            System.out.println("Something went wrong with the reverse process: " + e.getMessage());
        }
        return result;
    }

    private static int addNumbers(final int x, final int y) {
        int result = 0;
        try {
            int z, xn = x, yn = y;
            do {
                z = xn & yn;
                result = xn ^ yn;
                xn = z << 1;
                yn = result;
            } while (z != 0);
        } catch (Exception e) {
            System.out.println("Something went wrong with the addNumbers process: " + e.getMessage());
        }
        return result;
    }

    private static String readFile(String file) {
        String result = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            char characterSpliterator = ',';
            StringBuilder stringBuilder = new StringBuilder();
            int r;
            while ((r = reader.read()) != -1) {
                char ch = (char) r;
                if (ch != characterSpliterator) {
                    stringBuilder.append(ch);
                } else {
                    break;
                }
            }
            result = stringBuilder.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
