package boxing_unboxing;

// BigDecimal API�� �̿��� ���� ����
// �ΰ��� �Ǽ��� �Է¹޾Ƽ� �� ���� ������ ���(������ ������ �ʵ��� ���) 

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
