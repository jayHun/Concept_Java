package boxing_unboxing;

// BigDecimal API를 이용한 오차 제거
// 두개의 실수를 입력받아서 그 차의 절댓값을 출력(오차가 생기지 않도록 고려) 

import java.math.BigDecimal;
import java.util.Scanner;

public class Elminate_diff {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal input1 = sc.nextBigDecimal();
		BigDecimal input2 = sc.nextBigDecimal();
		
		System.out.println((input1.subtract(input2).abs()));
		sc.close();
	}
}
