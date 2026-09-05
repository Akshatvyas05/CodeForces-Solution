
import java.io.*;
import java.util.*;

public class ASoftDrinking {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int friends = Integer.parseInt(st.nextToken());
        int bottles = Integer.parseInt(st.nextToken());
        int capacity = Integer.parseInt(st.nextToken());
        int limes = Integer.parseInt(st.nextToken());
        int slices = Integer.parseInt(st.nextToken());
        int salt = Integer.parseInt(st.nextToken());
        int drinkPortion = Integer.parseInt(st.nextToken());
        int saltPortion = Integer.parseInt(st.nextToken());

        int totalDrink = bottles * capacity;
        int requiredDrinkForEachToast = friends * drinkPortion;
        int totalLimeSlices = limes * slices;
        int saltForEachToast = saltPortion * friends;

        System.out.println(Math.min(totalDrink / requiredDrinkForEachToast, Math.min(totalLimeSlices / friends, salt / saltForEachToast)));
    }
}
