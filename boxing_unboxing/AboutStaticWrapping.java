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
			System.out.println("iValue1�� iValue2�� ���� �ν��Ͻ� ����");
		else
			System.out.println("iValue1�� iValue2�� �ٸ� �ν��Ͻ� ����");
	}
}

/*
 * valueOf �޼���� �ν��Ͻ� ���� �ÿ� ������ �Ķ���Ͱ����� ������� �ν��Ͻ��� �̹� ������� ���¶��, 
 * ���ο� �ν��Ͻ��� �������� �ʰ�, ������ ������ �ν��Ͻ��� ���� ���� ��ȯ�Ѵ�.
 */