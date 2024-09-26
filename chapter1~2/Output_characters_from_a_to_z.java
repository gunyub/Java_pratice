package book_example_question;



public class Output_characters_from_a_to_z {
public static void main(String[] args) {
	char c = 'a';
	//c + 1은 현재 문자에 1을 더해 다음 문자로 이동하는 연산입니다.
	//(char)는 숫자를 다시 문자로 변환하는 역할을 합니다.
	do {
		System.out.print(c);
		c = (char) (c+1);
	}while(c<='z');
}
}
