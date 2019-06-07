package Quiz;

// 교재 237p
class Acc{
	static int sum = 0;
	
	static void add(int num) {
		for(int i = 0; i < num; i++)
			sum += i;
	}
	
	static void showResult() {
		System.out.println("sum = " + sum);
	}
}

public class Accumulator {
	public static void main(String[] args) {
		Acc.add(5);
		Acc.showResult();
	}
}
