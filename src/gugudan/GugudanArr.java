package gugudan;

public class GugudanArr {
	
	//메소드를 사용하여 반복되는 부분을 줄여보자
	//배열에 결과를 입력하는 메소드
	public static int[] cal(int times) {
		int[] result = new int[9];
		for (int i = 0; i < result.length; i++) {
			result[i] = times * (i + 1);
		}
		return result;
	}
	
	//배열에 입력된 결과를 출력하는 메소드
	public static void out(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	

	public static void main(String[] args) {

//		int[] times2 = new int[9];
//		
//		//2단
//		for (int i = 0; i < times2.length; i++) {
//			times2[i] = 2 * (i + 1);
//		}
//		
//		for (int i = 0; i < times2.length; i++) {
//			System.out.println(times2[i]);
//		}
//
//		
//		
//		//3단
//		int[] times3 = new int[9];
//		for (int i = 0; i < times3.length; i++) {
//			times3[i] = 3 * (i + 1);
//		}
//		
//		for (int i = 0; i < times3.length; i++) {
//			System.out.println(times3[i]);
//		}
		
		int[] times2 = cal(2);
		out(times2);
		int[] times3 = cal(3);
		out(times3);
	}
}
