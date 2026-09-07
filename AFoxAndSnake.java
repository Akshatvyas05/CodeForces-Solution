
import java.util.Scanner;

public class AFoxAndSnake {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int r = 1; r <= n; r++) {
            if (r % 2 != 0) {
                // Odd rows are completely filled with '#'
                for (int c = 0; c < m; c++) {
                    sb.append('#');
                }
            } else {
                // Even rows have a single '#' alternating between right and left
                if ((r / 2) % 2 != 0) {
                    // Turn right: '#' is at the last column
                    for (int c = 0; c < m - 1; c++) {
                        sb.append('.');
                    }
                    sb.append('#');
                } else {
                    // Turn left: '#' is at the first column
                    sb.append('#');
                    for (int c = 0; c < m - 1; c++) {
                        sb.append('.');
                    }
                }
            }
            sb.append('\n');
        }

        System.out.print(sb.toString());
        sc.close();
    }
}
