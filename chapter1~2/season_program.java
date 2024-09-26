// a season program 3~5spring, 6~8summer, 9~11autumn, 12~1winter

package book_example_question;

import java.util.Scanner;

public class season_program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("알고싶은 계절의 달을 입력하세요(1~12): ");
		
		int season = scanner.nextInt();
		switch(season) {
			case 3:
			case 4:
			case 5:
				System.out.println("따듯한 봄이에요");
			break;
			case 6:
			case 7:
			case 8:
				System.out.println("더운 여름이에요");
			break;
			case 9:
			case 10:
				System.out.println("쓸쓸한 가을이에요");
			break;
			case 11:
			case 12:
			case 1:
				System.out.println("추운 겨울이에요");
			break;
			default:
				System.out.println("1~12 숫자만 입력하세요");
		scanner.close();
		}
	}
}
