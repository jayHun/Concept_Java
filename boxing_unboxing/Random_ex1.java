package boxing_unboxing;

import java.util.Scanner;
import java.util.Random;

// �ΰ��� ���� a,b�� �Է¹޾Ƽ� a�� b ���̿� �����ϴ�(a,b ����) ���� 10���� �����ؼ� ���

public class Random_ex1 {
	
	public static void getRandom(int n1, int n2){
		Random rnd = new Random();
		int bound = n2-n1+1;
		for(int idx=0; idx<10; idx++){
			System.out.println(rnd.nextInt(bound)+n1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1  = sc.nextInt();
		int input2 = sc.nextInt();
		
		if(input1<input2)
			getRandom(input1, input2);
		else
			getRandom(input2, input1);
		sc.close();
	}
}