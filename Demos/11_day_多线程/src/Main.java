
public class Main {
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		
		ThreadDemo th = new ThreadDemo();
		th.start();
		
		//线程的状态
		//被创建
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}//冻结 睡眠
		
		try {
			th.wait(); //冻结 等待
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}//冻结 睡眠
		
		//th.notify(); //唤醒线程
		//th.stop(); //停止
		//阻塞状态，在等待CPU的执行权，具有运行资格，没有cpu的执行权
		
		for (int i  = 0; i < 10; i++){
			System.out.println("this is class main" + i);
		}
	}
}
