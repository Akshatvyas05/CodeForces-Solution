
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ASumOfRoundNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            List<Integer> roundNumbers = new ArrayList<>();
            int place = 1;

            while (n > 0) {
                int digit = n % 10;
                if (digit > 0) {
                    roundNumbers.add(digit * place);
                }
                n /= 10;
                place *= 10;
            }

            sb.append(roundNumbers.size()).append("\n");
            for (int i = 0; i < roundNumbers.size(); i++) {
                sb.append(roundNumbers.get(i));
                if (i < roundNumbers.size() - 1) {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}
