/**
 * Demo
 * 
 * (89) 0101 1001
 * (32) 0010 0000
 * 
 * &: 0000 0000 (0)
 * 
 * (113) 0111 0001
 * (32) 0010 0000
 * 
 * &: 0010 0000 (32)
 * 
 */

package b.bitwise_operators;

public class Example2_Demo {

	public static void main(String[] args) {
		
		int n1 = 89;
		int n2 = 32;
		int n3 = 113;
		
		System.out.println(n1 & n2); // 0
		System.out.println(n3 & n2); // 32

	}

}
