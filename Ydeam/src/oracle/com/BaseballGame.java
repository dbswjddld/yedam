package oracle.com;

import java.util.Scanner;

public class BaseballGame {
	public static void main(String[] args) {
		int[] quiz = new int[3];// 문제
		int[] ans = new int[3]; // 사용자가 입력한 답
		int strike = 0;
		int ball;
		Scanner sc = new Scanner(System.in);

		// 랜덤한 한자리 정수 3개 생성 (숫자 모두 다르게)
		do {
			for (int i = 0; i < 3; i++)
				quiz[i] = (int) (Math.random() * 10);
		} while (quiz[0] == quiz[1] || quiz[1] == quiz[2] || quiz[0] == quiz[2]);
		
		System.out.println("재미있는 숫자 야구게임~~~");

		while (strike < 3) {
			strike = 0;
			ball = 0;

			System.out.println("숫자 3개 입력 :");
			for (int i = 0; i < 3; i++)
				ans[i] = sc.nextInt();

			// 입력한 수와 정답이 맞는지 비교
			for (int i = 0; i < quiz.length; i++) {
				for (int j = 0; j < ans.length; j++) {
					if (quiz[i] == ans[j]) {
						if (i == j)
							strike++;
						else ball++;
					}
				}
			}
			System.out.println("strike : " + strike);
			System.out.println("Ball : " + ball);
		}

		System.out.print("* 정답! ");
		for (int i = 0; i < 3; i++)
			System.out.print(quiz[i]);
	}
}
