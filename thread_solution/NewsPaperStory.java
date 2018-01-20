package thread_solution;

class NewsColumn{
	String column;
	boolean isNull=true;
	
	public void setColumn(String column){
		if(isNull){
			this.column=column;
			isNull=false;
			synchronized(this){
				notifyAll();
			}
		}
	}
	
	public String getColumn(){
		try{
			if(isNull){
				synchronized(this){
					wait();
				}
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		return column;
	}
}

class NewsWritter extends Thread{
	NewsColumn news;
	
	public NewsWritter(NewsColumn news){
		this.news=news;
	}
	
	public void run(){
		news.setColumn("This is recent news");
	}
}

class NewsReader extends Thread{
	NewsColumn news;
	
	public NewsReader(NewsColumn news){
		this.news=news;
	}
	
	public void run(){
		System.out.println("News : " + news.getColumn());
	}
}

public class NewsPaperStory {
	public static void main(String[] args) {
		NewsColumn news = new NewsColumn();
		NewsWritter nw = new NewsWritter(news);
		NewsReader nr = new NewsReader(news);
		
		nr.start();
		nw.start();
		
		try{
			nw.join();
			nr.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
