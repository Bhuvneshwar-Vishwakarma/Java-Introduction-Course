

package queue;

public class MainClass {

	public static void main(String[] args) {
		
//		MyQueue<Integer> mq = new MyQueue<>();
		QueueByMe<Integer> mq = new QueueByMe<>();
		mq.enqueue(12);
		mq.enqueue(42);
		mq.enqueue(11);
		mq.enqueue(23);
		
		for(int i = 0; i<5; i++) {
			System.out.println(mq.dequeue());
		}
			
			
/*		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());  */
		
	/*	Queue<Integer> q = new LinkedList<>();
		
		q.add(15);
		q.add(12);
		q.add(5);
		
		System.out.println(q);
		
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		
		System.out.println(q.poll());
		
		System.out.println(q.element());   */
		
	}

}
