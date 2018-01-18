package boxing_unboxing;

// general instance producing method 
// 1. using keyword "new"
// 2. using static method

public class AboutStaticWrapping {
	
	public static void main(String[] args) {
		
		// Integer iValue1 = new Integer(10); 
		// Integer iValue2 = new Integer(10);
		
		Integer iValue1 = Integer.valueOf(10);
		Integer iValue2 = Integer.valueOf(10);
		
		if(iValue1==iValue2)
			System.out.println("iValue1과 iValue2는 동일 인스턴스 참조");
		else
			System.out.println("iValue1과 iValue2는 다른 인스턴스 참조");
	}
}

/*
 * valueOf 메서드는 인스턴스 생성 시에 동일한 파라미터값으로 만들어진 인스턴스가 이미 만들어진 상태라면, 
 * 새로운 인스턴스를 생성하지 않고, 기존에 생성된 인스턴스의 참조 값을 반환한다.
 */