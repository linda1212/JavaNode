
public class ThreadDemo extends Thread {
	
	public void run (){
		
		for (int i = 0; i < 10; i++){
			System.out.println("this id thread demo" + i);
		}
		
	}
}
