package thread_solution;

/* create two threads by defining Thread Class
 * first thread : sum of 1~50
 * second thread : sum of 51~100
 * print out total sum of 1~100
 */

class TestThread extends Thread{
	int num, start, end;
	
	public TestThread(int st, int en){
		num=0;
		start=st;
		end=en;
	}
	
	private void adder(int n){
		num+=n;
	}
	
	public int getNum(){
		return num;
	}
	
	public void run(){
		for(int i=start; i<=end; i++){
			adder(i);
		}
	}
}

public class RunnableThread2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThread tt1 = new TestThread(1, 50); 
		TestThread tt2 = new TestThread(51, 100);
		
		tt1.start();
		tt2.start();
		
		try{
			tt1.join();
			tt2.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			System.out.println("1~100 Sum : " + (tt1.getNum()+tt2.getNum()));
		}
	}
}
