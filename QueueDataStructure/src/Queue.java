
public class Queue {
	int arr[] = null;
    int capacity = 5;
    int front = 0;
    int rear = -1;
    public Queue() {
 	   this.arr = new int[capacity];
    }
    
    public void enqueue(int data) {
    	if(rear+1==capacity) {
    		System.out.println("Queue is full");
    		return;
    	}
         arr[++rear] = data;
         System.out.println("The inserted data is"+data);       
    }
    public void dq() {
        if(front==rear+1) {
        	System.out.println("Queue is empty");
        	return;
        }
    	int data = arr[front];
    	for(int i=front;i<rear;i++) {
    		arr[i] = arr[i+1];
    		 
    		
    	}
    	rear--;
    	 System.out.println("The deleted data is"+data);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Queue q = new Queue();
       q.enqueue(50);
       q.enqueue(40);
       q.enqueue(30);
       q.enqueue(20);
       q.enqueue(10);
       q.enqueue(9);
       q.enqueue(8);
       q.dq();
       q.dq();
       q.dq();
       q.dq();
       q.dq();
       q.dq();
	}

}
