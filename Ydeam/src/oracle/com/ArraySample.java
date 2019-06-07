package oracle.com;

public class ArraySample {
	public static void main(String[] args) {
		int[] ary = {1,2,3};
//		int ary[] = {1,2,3};
		// 배열 선언과 동시에 값을 넣을 수도 있다
		int[] arry = new int[5];
//		System.out.println(ary[0]);
		
		for(int i = 0; i < ary.length; i++)
			System.out.println(ary[i]);
		
		System.out.println("arry의 내용 출력");
		for (int i = 0; i < arry.length; i++)
			System.out.println(arry[i]);
		// 결과 : 00000  -> 배열의 초기값은 0이다
		
		// arry에 10, 20, 30, 40, 50넣기 (for 활용)
		for (int i = 0; i < arry.length; i++) {
			arry[i] = (i + 1) * 10;
			System.out.println(arry[i]);
		}
		
		// 100,200,300,... (while)
		int i = 0;
		while(i < arry.length) {
			arry[i] = (i + 1) * 100;
			System.out.println(arry[i]);
			i++;
		}
		
		// 배열의 합계 구하기
		int sum = 0;
		for (int j = 0; j < arry.length; j++)
			sum += arry[j];
		System.out.println("배열의 합계는 " + sum);
		
		// 함수ㅈ
		int result = sum(arry);
		System.out.println("합 " + result);
	}
	
	// 입력받은 배열의 합계를 구하는 함수
	static int sum(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[i];
		return sum;
	}
}
