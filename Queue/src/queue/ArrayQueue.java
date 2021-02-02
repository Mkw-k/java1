package queue;

public class ArrayQueue {

	private int front;
	private int rear;
	private int maxSize;
	
	private Object queueArray[];
	
	public ArrayQueue(int maxSize) {
		front = 0;
		rear = -1;
		this.maxSize = maxSize;
		queueArray = new Object[maxSize];
	}
	
	public boolean isEmpty() {
		return (front == rear + 1);
	}
	
	public boolean full() {
		return (rear == maxSize - 1);
	}
	
	public void push(Object item) {
		if(full()) {
			System.out.println("queue공간이 가득 차 있습니다");
			return;
		}
		
		rear++;
		queueArray[rear] = item;		
	}
	
	public Object pop() {
		Object item = peek();
		front++;
		return item;
	}
	
	public Object peek() {
		if(isEmpty()) {
			System.out.println("queue공간에 데이터가 없습니다");
			return null;
		}
		
		return queueArray[front];
	}
	
	
	
	
}










