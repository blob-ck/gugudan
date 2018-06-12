package gugudan;

public class GugudanArr {

	public static void main(String[] args) {

		int[] times2 = new int[9];
		
		//2단
		for (int i = 0; i < times2.length; i++) {
			times2[i] = 2 * (i + 1);
		}
		
		for (int i = 0; i < times2.length; i++) {
			System.out.println(times2[i]);
		}

		
		
		//3단
		int[] times3 = new int[9];
		for (int i = 0; i < times3.length; i++) {
			times3[i] = 3 * (i + 1);
		}
		
		for (int i = 0; i < times3.length; i++) {
			System.out.println(times3[i]);
		}
		
	}

}
