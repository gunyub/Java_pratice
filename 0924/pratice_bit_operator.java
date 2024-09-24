/* 오른쪽 시프트는 시프트 횟수만큼 /2 해주는 값이랑 같다.
 * 왼쪽 시피트는  시프트 횟수만큼 *2 해주는 값이랑 같아.
 */
package book_example_question;

public class pratice_bit_operator {
	public static void main(String[] args) {
		byte a = 5;
		byte b = (byte) (a<<2);
		System.out.println(b);
		
		byte a1 = 20;
		byte b2 = (byte) (a1>>>2);
		System.out.println(b2);
		
		byte a3 = (byte)0xf8; //-8
		byte b3= (byte) (a3>>2); //-2
		System.out.println(b3);
		
		int x=2, y=10, z=0;
		z = x++*2+--y-5+x*(y%2); // p99
		System.out.println(z);
		System.out.println(8 >> 2);
		System.out.println(-16 >> 2);
	}
}
