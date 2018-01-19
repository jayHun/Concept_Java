package thread_solution;

/* create two threads using interface implementation
 * first thread : sum of 1~50
 * second thread : sum of 51~100
 * print out total sum of 1~100
 */

class Adder{
	int num;
	
	public Adder(){
		num=0;
	}
	
	public void addNum(int n){
		num+=n;
	}
	
	public int getNum(){
		return num;
	}
}

class UserThread extends Adder implements Runnable{
	int start, end;
	
	public UserThread(int st, int en){
		start=st;
		end=en;
	}
	
	public void run(){
		for(int i=start; i<=end; i++){
			addNum(i);
		}
	}
}

public class RunnableThread1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserThread ut1 = new UserThread(1, 50);
		UserThread ut2 = new UserThread(51, 100);
		
		Thread at1 = new Thread(ut1);
		Thread at2 = new Thread(ut2);
		
		at1.start();
		at2.start();
		
		try{
			at1.join();
			at2.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			System.out.println("1~100 Sum : " + (ut1.getNum()+ut2.getNum()));
		}
	}
}