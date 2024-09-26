// 초단위의 정수를 입력받고 몇 시간, 몇 분, 몇 초인지 출력하는 프로그램 작성 
package book_example_question;

import java.util.Scanner;

public class time_output_program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("초 입력");
		int num = scanner.nextInt();
		int time = (num/60)/60;
		int minute = (num/60)%60;
		int second = num%60;
		System.out.println(time+"시간"+minute+" 분"+second+" 초");
		scanner.close();
		
		
		
	}
}
