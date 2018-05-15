package threads;

// Below is a completed program that uses brute force to crack a 9-digit password. 
// On average, the program takes about 0.125 seconds to find the password.
// Your goal is to re-write the algorithm using Threads. Try to shorten the time it takes 
// to find the code to be as little as possible.
// Let's see who can crack the code the fastest!

// Pro-tip: Do not include the creation of the threads as part of the time. 

import java.util.Random;

public class ModdedCracker {
	static long code = (long)(new Random().nextDouble() * 1_000_000_000);
	
	static long startTime;
	static long endTime;
	static float elapsedTime;
	
	public static void main(String[] args) {
		System.out.println("Starting Modded Checker");
		startTime = System.currentTimeMillis();
		Thread a = new Thread(()->check(0));
		Thread b = new Thread(()->check(1));
		Thread c = new Thread(()->check(2));
		Thread d = new Thread(()->check(3));
		Thread e = new Thread(()->check(4));
	}
	public static void check(int a) {
		int ctr = a;
		while(!checkCode(ctr+=5));
		
		endTime = System.currentTimeMillis();
		elapsedTime = (float)(endTime - startTime);
		elapsedTime /= 1000.f;
		System.out.println("Total time taken: " + elapsedTime + " seconds");
	}
	
	
	public static boolean checkCode(long p){
		if(p == code){
			System.out.println("Correct: "+p);
			return true;
		}else{
			return false;
		}
	}
}
