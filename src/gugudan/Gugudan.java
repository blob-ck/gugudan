package gugudan;

public class Gugudan {

	public static void main(String[] args) {
		
		//하나하나 다 쓰고 출력
		//2단
		/*System.out.println(2 * 1);
		System.out.println(2 * 2);
		System.out.println(2 * 3);
		System.out.println(2 * 4);
		System.out.println(2 * 5);
		System.out.println(2 * 6);
		System.out.println(2 * 7);
		System.out.println(2 * 8);
		System.out.println(2 * 9);*/
		
		
		//반복문 1개 이용하여 원하는 단수 1세트 출력
		/*for (int i = 1; i <= 9; i++) {
			System.out.println(2 * i);
		}
		
		
		//3단
		for (int i = 1; i <= 9; i++) {
			System.out.println(3 * i);
		}*/
		
		
		
		//반복문 2개 사용하여 원하는 단수와 곱하는 수 범위 자동 출력 - 범위만 정하면 된다
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(j + " x " + i + " = " + i*j + "	");
			}
			System.out.println("");
		}
	}

}
