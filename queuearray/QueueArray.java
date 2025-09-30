package com.queuearray;

public class QueueArray {
	int front;
	int rear;
	int capacity;
	int size;
	int arr[];
	
	QueueArray(int capacity){
		front=rear=-1;
		this.capacity=capacity;
		size=0;
		arr=new int[capacity];
		}
	
	public int enqueue(int ele) {
		if(isFull()) {
			System.out.println("its full");
			return ele ;
		}
		if(front==-1) {
			front=0;
		}
		arr[++rear]=ele;
		size++;
		System.out.println(ele+" added to queue");
		return ele;
	}
	public int dequeue(int ele) {
		if(isEmpty()) {
			System.out.println(" its empty");
			return -1;
		}
	    int data =arr[front];
	    front++;
	    size--;
	    if(size==0) {
	    	front=rear=-1;
	    	
	    }
	    return data;
		
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("its empty");
			return -1;
		}
		int data=arr[front];
		return data;
	}
	
	public boolean isFull() {
		if(size==capacity) {
			return true;
			
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(size==0) {
			return true;
		}
		return false;
	}
	
	public void print_queue() {
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueArray qa=new QueueArray(3);
		System.out.println(qa.enqueue(10));
		System.out.println(qa.enqueue(20));
		System.out.println(qa.enqueue(30));
		System.out.println(qa.dequeue(20));
		
		

	}

}
