/*Find out how many birthday candles you need according to your age
Red candle, 10 years old, blue candle, 5 years old, yellow candle, 1 year old*/
package book_example_question;

import java.util.Scanner;

public class Birthday_candle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int red_candle = 10;
		int blue_candle = 5;
		int yellow_candle = 1;
		int age = scanner.nextInt();
		
		int red = age/red_candle;
		int blue = (age%red_candle)/blue_candle;
		int yellow = (age%red_candle)%blue_candle;
		System.out.println("red:"+red+" blue:"+blue+" yellow:"+yellow);
		scanner.close();
	}	
}
