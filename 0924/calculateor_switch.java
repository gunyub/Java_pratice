// 사칙연산

package book_example_question;

import java.util.Scanner;

public class calculateor_switch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 operater(한글로) 숫자 입력:");
		
		double x = scanner.nextDouble();
		String op = scanner.next();
		double y = scanner.nextDouble();
		double result = 0;
		
		
		switch(op) {
			case "곱하기":
				result = x*y;
				break;
			
			case "나누기": 
				if(x==0||y==0) {
					System.out.println("0은 나눌수 없습니다");
					break;
				}else {
						result = x/y;
						break;
				}
			case "빼기":
				result = x-y;
				break;
			case "더하기":
				result = x+y;
				break;
			
			default:
				System.out.println("사칙연산이 아닙니다");
			
		}
		System.out.println(x + op + y + "="+ result);
		scanner.close();
	}
}
