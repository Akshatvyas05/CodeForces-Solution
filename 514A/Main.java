import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
			
		int builder = 0;
		int track = 0;

		while(input>0){
			int rem = input%10;
			builder += invert(rem)*Math.pow(10, track);
			track++;
			input = input/10;			
		}

		System.out.println(builder);
	}

	private static int invert(int num){
		if(num>=5) return 9-num;
		return num;
	}
}
