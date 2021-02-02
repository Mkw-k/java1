package stack;

public class ArrayStack {
	
	private int top;
	private int maxSize;
	
	private Object stackArray[];
	
	public ArrayStack(int maxSize) {
		this.maxSize = maxSize;
		stackArray = new Object[maxSize];
		top = -1;
	}
	
	// 스택공간이 비어 있는지 
	public boolean isEmpty() {
		return (this.top == -1);
	}
	
	// 스택공간이 가득 차있는지 
	public boolean full() {
		return (this.top == maxSize-1);
	}
	
	// 추가
	public void push(Object item) {
		if(full()) {
			System.out.println("스택 공간이 가득 차 있습니다");
			return;
		}
		
		top++;
		stackArray[top] = item;
	}
	
	// 삭제
	public Object pop() {
		Object item = peek();
		top--;
		return item;
	}
	
	// 최상위에 데이터(공)
	public Object peek() {
		if(isEmpty()) {
			System.out.println("스택 공간이 비어 있습니다");
			return null;
		}
		
		return stackArray[top];
	}
	
	

}






