package com.collection.queue;

import java.util.PriorityQueue;

/**
 * Queue does not allow heterogeneous type of data does not maintain insertion
 * order, duplicates are allowed.
 */
public class QueueDemo {

	public static void main(String[] args) {

		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();

		priorityQueue.add(23);
		priorityQueue.add(2);
		priorityQueue.add(56);
		priorityQueue.add(9);
		priorityQueue.add(43);

		// null is not allowed
		// priorityQueue.add(null);

		// offer() is also used to add elements
		priorityQueue.offer(76);

		System.out.println(priorityQueue);

		// get head element
		/*
		 * When the collection is null, element() -> throws NoSuchElementException
		 * peek() -> erturn null
		 */
		PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<Integer>();
		// System.out.println(priorityQueue2.peek());
		// System.out.println(priorityQueue2.element());

		// return and remove element from the queue

		System.out.println("header element: " + priorityQueue.element());
		System.out.println("removes header element and returns: " + priorityQueue.remove());

		System.out.println("removes and head and returns: " + priorityQueue.poll());

		/*
		 * element() -> removes head of the queue, when queue is null throws
		 * NoSuchElementException. poll() -> removes head of the queue, when queue is
		 * null return null
		 */
		// System.out.println(priorityQueue2.remove());
		System.out.println(priorityQueue2.poll());
		

	}
}
