package oracle.com;

public class TestSample {
	public static void main(String[] args) {
		// 1~100 중 2의 배수이면서 7의 배수인 수를 출력하고 합계 구하기 (for문)
		int num;
		int sum = 0;
		for (num = 1; num <= 100; num++) {
			if (num % 7 == 0 && num % 2 == 0) {
				System.out.println(num);
				sum += num;
			}
		}
		System.out.println("합계 : " + sum);

		// 마름모 만들기
		// i:행, j:열
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i <= 5) {
					if (6 - i <= j && j <= 4 + i)
						System.out.print("*");
					else
						System.out.print("0");
				} else {
					if (j <= i - 5 || 15 - i <= j)
						System.out.print("0");
					else
						System.out.print("*");
				}
			}
			System.out.println("");
		}

		// 모래시계 모양 만들기
		for (int i = 1; i <= 9; i++) {
			
		}

		// 1부터 홀수 더하기. 몇번째 수를 더해야 1000이 넘는지, 1000을 넘는 값이 뭔지 (continue, break)
		int sum = 0, num = -1, count = 0;
		while (sum < 1000) {
			count++;
			num += 2;
			sum += num;
			System.out.println(count + "번째 홀수:" + num + "/ 합계:" + sum);
		}


	}
}
