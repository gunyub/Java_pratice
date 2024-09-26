/* 점수와 학년을 입력받아 60점 이상이면 합격, 미만이면 불합격을 출력. 
 * 4학년의 경우 70점 이상이어야 합격이다.
 */
package book_example_question;

import java.util.Scanner;

public class Pass_or_Fail_Decision_Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 점수 학년 입력받기
		System.out.print("점수를 입력하세요: ");
		int score = scanner.nextInt();
		System.out.print("학년을 입력하세요: ");
		int grade = scanner.nextInt();
		
		//삼항 연산자는 값을 반환하는 연산자 메서드인 syso는 사용 불가 
		String result = (score>=60 && grade<=3) || (score>=70 && grade==4)?"합격입니다":"불합격입니다";
		System.out.println(result);
		
		scanner.close();
	}
}
