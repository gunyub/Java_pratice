// 카페 음료수 가격 알려주기
package book_example_question;

import java.util.Scanner;

public class switch_String {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		String drink = scanner.nextLine();
		
		switch(drink) {
			case "카페모카":
			case "딸기라떼":
			case "연유라떼":
				System.out.println("3500원입니다");
			break;
			case "아이스아메리카노":
				System.out.println("2000원입니다");
				break;
			default:
				System.out.println("없는 메뉴입니다");
		}
		scanner.close();
	}
}
