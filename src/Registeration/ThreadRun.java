package Registeration;

public class ThreadRun extends Thread{
	
	public void run()     // Thread in running state
	{
		
		System.out.println("Thread executing");
		for(int i=0;i<3;i++) 
		{
	
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	

	public static void main(String[] args) {
		
		
		ThreadRun t1 = new ThreadRun();   //This is thread in new state
//		System.out.println(t1.getId());
//		System.out.println(t1.getName());
//		System.out.println(t1.getPriority());
		
		ThreadRun t2 = new ThreadRun();
		
		
//		t2.setName("Jobito");
//		t2.setPriority(MAX_PRIORITY);
		
//		System.out.println(t2.getId());
//		System.out.println(t2.getName());
//		System.out.println(t2.getPriority());
		
		t1.start();    //Thread in ready state.
//		t1.start();    // We cannot give command to operating system to change the thread running state
		t2.start();
		t1.run();  // Thread treated as a normal method

	}

}
