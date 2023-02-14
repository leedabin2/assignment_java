package edu.thread;

class Worker extends Thread{
	public void run() {
		for (int i = 0; i < 4; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				 throw new RuntimeException(e);
		}
	}
}
}
public class Thread0214_Task {

	public static void main(String[] args) {
	   	int alphabet = 'a';
    	Thread t = new Worker();
    	t.start();
 
    	for (int i =0; i < 10; i++) {	
    		System.out.println((char)((int)alphabet+i));
    		try {
    				Thread.sleep(500);
    	}catch (InterruptedException e) {
			throw new RuntimeException(e);
	}
	}

	}

}
