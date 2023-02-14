package edu.thread;


public class Thread0214_Task {

	public static void main(String[] args) {
	 	Runnable worker = () -> {
    		for (int i = 0; i < 4; i++) {
    			System.out.println(i);
    			try {
    				Thread.sleep(1000);
    			}catch (InterruptedException e) {
   				 throw new RuntimeException(e);
    			}
    		}
    	};
    	
    	new Thread(worker).start();
    	
       	int alphabet = 'a';
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
