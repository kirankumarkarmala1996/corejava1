package com.Collections;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {

	public static void main(String[] args) {
//		it will follow principle(FIFO) it give priority for lowest value 
//		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();//1 11 2 13 14 12 10
//		Queue<Integer> pq = new PriorityQueue<Integer>();
//		Deque<Integer> pq = new LinkedList<Integer>();//it work for the linkedlist
		
		
//		if you want to give the priority from highest value to lowest value follow this
		PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());

//toAdd the values
		pq.add(10);
		pq.offer(11);
		pq.add(12);
		pq.add(13);
		pq.add(14);
		pq.add(2);
		pq.add(1);
		

//		System.out.println(pq);
//to retrieval the values
//		pq.peek();

//		System.out.println(pq);

//to remove the values
//		pq.poll();// it will remove the first element
//		System.out.println(pq);
//		pq.remove();
		
//		for(Integer num:pq) {
//			System.out.print(" "+num);
//		}
//		System.out.println("");
//		isEmpty(); (Returns true if this collection contains no elements)
//		while(!pq.isEmpty()) {
//			System.out.println(pq.poll());
//		}
		
		ArrayDeque<Integer> dq= new ArrayDeque<>();
		dq.add(107);
		dq.addFirst(7);
		dq.addLast(101);
		dq.offer(5);
		dq.offerFirst(01);
		dq.offerLast(4);
		dq.offerLast(4);//allow duplicates
//		dq.offer(null);//doesn't allow null
//		System.out.println(dq);
		
//		while (!dq.isEmpty()) {
//			System.out.println(dq.poll());
//			
//		}
	}

}
