package gugudan;

import java.util.Scanner;

public class Gugudan {
	
	void menu() {
		System.out.println("");
		System.out.println("숫자를 입력하세요");
		System.out.println("1 - 다시 입력");
		System.out.println("2 - 종료 ");
	}
	
	//재귀로 1과 2 만 입력받도록 했다.
	int con(int i) {
		
		if(i != 1 && i !=2) {
			System.out.println("");
			System.out.println("1과 2 중 선택하세요");
			
			//반복되는 출력문
			menu();
			
			return con(new Scanner(System.in).nextInt());
		}
		
		return i;
	}

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
//		for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.print(j + " x " + i + " = " + i*j + "	");
//			}
//			System.out.println("");
//		}
		
		
		
		//이제 키보드로 입력받아 출력해보자
		Gugudan ggd = new Gugudan();
		//int button = 1;
		//while(button == 1){
		//변수를 사용하지 않도록 고쳐봤다 - button 없앰
		while(true){
			
			System.out.println("구구단 중 출력할 단 입력 : ");
			
			Scanner sc = new Scanner(System.in);
			int dan = sc.nextInt();
			System.out.println("몇 배까지 출력? : ");
			int times = sc.nextInt();
			
			for (int i = 1; i <= times; i++) {
				System.out.println(dan + " x " + i + " = " + i*dan);
			}
			
			//반복되는 출력문을 따로 메소드로 만들었다.
			ggd.menu();

			//button = ggd.con(sc.nextInt());
			
			//if(button == 2){
			if(ggd.con(sc.nextInt()) == 2){
				break;
			}
		}
	}
}
