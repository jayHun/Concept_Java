package boxing_unboxing;

// 0�̻� 10�̸��� ���� 5���� �����ؼ� ��� , Math.random �޼��� ���

public class Random_ex2 {

	public static void main(String[] args){
		int idx=0;
		while(idx<5){
			System.out.println((int)(Math.random()*10));
			idx++;
		}
	}
}