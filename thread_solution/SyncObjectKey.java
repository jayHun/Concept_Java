package thread_solution;

class AddOneTwoNum{
	int num1;
	int num2;
	
	public AddOneTwoNum(){
		num1=0;
		num2=0;
	}
	
	public void addOneOne(){ synchronized(key1){ num1+=1;} }
	public void addOneTwo(){ synchronized(key1){ num1+=2;} }
	public void addTwoOne(){ synchronized(key2){ num2+=1;} }
	public void addTwoTwo(){ synchronized(key2){ num2+=2;} }
	public void showAll(){
		System.out.print("num1 : " + num1 + "\nnum2 : " + num2);
	}
	
	Object key1 = new Object();
	Object key2 = new Object();
}

class AccessThread extends Thread{
	AddOneTwoNum ut;
	
	public AccessThread(AddOneTwoNum at){
		ut=at;
	}
	
	public void run(){
		ut.addOneOne();
		ut.addOneTwo();
		ut.addTwoOne();
		ut.addTwoTwo();
	}
}

public class SyncObjectKey {
	public static void main(String[] args) {
		AddOneTwoNum ut = new AddOneTwoNum();
		AccessThread at1 = new AccessThread(ut);
		AccessThread at2 = new AccessThread(ut);
		
		at1.start();
		at2.start();
		
		try{
			at1.join();
			at2.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			ut.showAll();
		}
	}
}
