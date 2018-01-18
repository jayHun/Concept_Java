package boxing_unboxing;

// 0이상 10미만의 난수 5개를 생성해서 출력 , Math.random 메서드 사용

public class Random_ex2 {

	public static void main(String[] args){
		int idx=0;
		while(idx<5){
			System.out.println((int)(Math.random()*10));
			idx++;
		}
	}
}