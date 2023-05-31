package CollectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String args[])
    {
        /*
        PriorityQueue is implementing queue by giving the priority to element , maxheap , minheap is implemented using priorityQueue only

         */
        //PriorityQueue<Integer> pq = new PriorityQueue<>();
        //To convert the queue to Min Heap to Max Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        //To add element it is same as we have used in Queue
        pq.add(10000);
        pq.add(1000);
        pq.add(2000);
        pq.add(3000);
        //Here element get print in the order of Min Heap : In this smallest element are the top
        System.out.println("Priority Queue element are : " +pq);
        //In the Poll that element will poll first whose priority are high and here smallest element have the highest priority
        System.out.println("Priotity Queue element pop  : "+pq.poll());
        System.out.println("Priority Queue element after pop are : " +pq);
        System.out.println("Priority Queue element which come out will select that  :" +pq.peek());
    }
}
