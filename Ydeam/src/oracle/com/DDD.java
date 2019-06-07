package oracle.com;

public class DDD {
	public static void main(String[] args) {
		int num = 1;
		int[][] ary = new int[5][5];
		
		// 배열에 수 입력
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				ary[i][j] = num++;
			}
		}
		
		System.out.println("원본 배열");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%4d", ary[i][j]);
			}
			System.out.println("");
		}
		
		System.out.println("반시계 90도 회전");
		for (int j = 4; j >= 0; j--) {
			for (int i = 0; i < 5; i++) {
				System.out.printf("%4d", ary[i][j]);
			}
			System.out.println("");
		}
		
		System.out.println("시계방향 90도 회전");
		for (int j = 0; j < 5; j++) {
			for (int i = 4; i >= 0; i--) {
				System.out.printf("%4d", ary[i][j]);
			}
			System.out.println("");
		}
		
		System.out.println("180도 회전");
		for (int j = 4; j >= 0; j--) {
			for (int i = 4; i >= 0; i--) {
				System.out.printf("%4d", ary[i][j]);
			}
			System.out.println("");
		}
	}
}
