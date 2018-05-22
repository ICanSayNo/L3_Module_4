package threads;

public class ThreadedReverseGreeting {
  //Write a program that creates a thread (Thread 1) that creates another thread (Thread 2); 
  //Thread 2 creates Thread 3; and so on, up to Thread 50. 
  //Each thread should print "Hello from Thread <num>!", 
  //but you should structure your program such that the threads print their greetings in reverse order.
	public static int times = 50;
	public static void main(String[] args) {
		Thread r1 = new Thread(()->create());
		r1.start();
	}
	public static void create() {
		System.out.println("Hello from thread "+times);
		
		if(times>0) {
			times--;
			Thread r1 = new Thread(()->create());
			r1.start();
		}
		}
}
