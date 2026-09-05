
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AChewbaccaAndNumber {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] chars = br.readLine().trim().toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int num = chars[i] - '0';

            if (num >= 5) {
                if (num == 9 && i == 0) {
                    continue;
                }
                // Add '0' to convert the digit value back to its ASCII char
                chars[i] = (char) ('0' + (9 - num));
            }
        }

        System.out.println(new String(chars));
    }
}
