package thread_solution;

// threadheap multiaccess

class Sum{
	int num;
	
	public Sum(){
		num=0;
	}
	
	public void addNum(int n){
		num+=n;
	}
	
	public int getNum(){
		return num;
	}
}

class TestingThread extends Thread{
	Sum sumInst;
	int start, end;
	
	public TestingThread(Sum sum, int st, int en){
		sumInst=sum;
		start=st;
		end=en;
	}
	
	public void run(){
		for(int i=start; i<=end; i++){
			sumInst.addNum(i);
		}
	}
}

public class ThreadHeapMultiAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum s=new Sum();
		TestingThread tt1 = new TestingThread(s, 1, 50);
		TestingThread tt2 = new TestingThread(s, 51, 100);
		
		tt1.start();
		tt2.start();
		
		try{
			tt1.join();
			tt2.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			System.out.println("1~100 Sum : " + s.getNum());
		}
	}
}
