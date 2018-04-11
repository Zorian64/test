/**
 * Created by Zorian Fedoryga on 11.04.2018.
 */
public class Main {


    public static void main(String[] args) {

        String testLine = "Java test";
        System.out.println("Reverse line process: " + reverseLine(testLine));


        int x = 15;
        int y = -3;
        System.out.println("Add two int numbers without arithmetic operations process: " + addNumbers(x, y));

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

}