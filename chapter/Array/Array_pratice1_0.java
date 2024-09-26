// 양수 5개를 입력받아 배열에 저장하고 가장큰값찾기
package book_example_question;

import java.util.Scanner;

public class Array_pratice1_0 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int intArray[] = new int[5];
	int max =0;
	System.out.println("정수5개를입력하세요");
	for(int i=0; i<5; i++) {
		intArray[i] = scanner.nextInt();
		if(intArray[i]>max) {
			max = intArray[i];
		}
		
	}
	System.out.println("가장큰값은"+max);
		scanner.close();
	}
}

