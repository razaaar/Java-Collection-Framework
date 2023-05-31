package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinedListQueue {
    public static void main(String args[])
    {
        /*Queue is normal DS which is first in First Out and it has two end front and rear
            From Front we add element and from rear we to deleton of data , like in train ticket
            Queue can be implemented using to ways : 1. Array 2 . Linkedlist */

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);//It allow to add element in the queue
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        System.out.println("queue element are : "+ queue);
        System.out.println("Queue poll element is : "+queue.poll());// Used to delete the data
        System.out.print("queue element after deleting the data is : "+ queue);
        System.out.println("Queue Element to Pop next is : "+ queue.peek()); // Tell which element will pop next
        //study more about in programming website
        /*
        Some of the common method used of the Queue interface are :
        add() : Insert element into queue . If successfull return true , if not it throws an exception
        offer() : insert element into the Queue . If successfull retrn true , if not it return false
        element() : Return the head of the Queue . Throws an exception if the queue is empty
        peek() : Return the head of the Queue , Return Null if the queue is empty
        remove() : Return and remove the head of the Queue , Thqows an exception if the Queue is empty
        poll() : Return and removes the head of the Queue , Return NULL if the queue is empty
         */




    }
}
