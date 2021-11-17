package com.evoke.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> queue = new PriorityQueue<>();

		System.out.println(queue.peek());

		// System.out.println(queue.element()); //throws error if queue empty

		for (int i = 1; i <= 10; i++) {
			queue.offer(i);
		}
		System.out.println(queue);

		System.out.println(queue.peek());

		System.out.println(queue.element());

		System.out.println(queue.poll()); // removes first element , if empty it shows null

		System.out.println(queue);

		System.out.println(queue.remove()); // removes first element , returns exception if queue is empty

		System.out.println(queue);

	}

}
