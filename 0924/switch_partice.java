// 학점 매기는 코드 switch
package book_example_question;

import java.util.Scanner;

public class switch_partice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		//변수 선언
		int score = scanner.nextInt();
		char grade; 
		// 몫을 구하면 99점도 9가댐, break 문을 사용하지 않으면 조건이 맞아도 마지막 식 까지 내려가서 나옴
		// case 는 (문자,정수,문자열)리터럴만 사용가능 변수나 식은 사용 불가
		switch(score/10) {
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
			case 7:
				grade = 'B';
				break;
			case 6:
			case 5:
				grade = 'C';
				break;
			default:
				grade = 'F';
		}
		System.out.println("학점은 "+grade+"입니다");
		scanner.close();
	}
}
