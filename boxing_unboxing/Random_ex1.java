package boxing_unboxing;

import java.util.Scanner;
import java.util.Random;

// 두개의 정수 a,b를 입력받아서 a와 b 사이에 존재하는(a,b 포함) 난수 10개를 생성해서 출력

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