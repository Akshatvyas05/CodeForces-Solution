
import java.io.*;
import java.util.*;

public class ABeautifulMatrix {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int r = -1;
        int c = -1;

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(st.nextToken());
                if (val == 1) {
                    r = i;
                    c = j;
                }
            }
        }

        int moves = Math.abs(r - 2) + Math.abs(c - 2);
        System.out.println(moves);
    }
}
