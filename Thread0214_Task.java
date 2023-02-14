package edu.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread0214_Task {

	public static void main(String[] args) {
		Runnable task = () -> {
			for (int i = 0; i < 4; i++) {
    			System.out.println(i);
    			try {
    				Thread.sleep(1000);
    			}catch (InterruptedException e) {
   				 throw new RuntimeException(e);
    			}
    		}
    	};
    	ExecutorService exec = Executors.newCachedThreadPool();
    	exec.submit(task);
    	
       	int alphabet = 'a';
    	for (int i =0; i < 10; i++) {	
    		System.out.println((char)((int)alphabet+i));
    		try {
    				Thread.sleep(500);
    	}catch (InterruptedException e) {
			throw new RuntimeException(e);
	}
		}
    	exec.shutdown();

	}

}
