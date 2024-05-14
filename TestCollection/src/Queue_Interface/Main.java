package Queue_Interface;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.PriorityBlockingQueue;

public class Main {
    public static void main(String[] args){
//        TestLinkdedList testLinkdedList = new TestLinkdedList();
//        testLinkdedList.DisplayLinkedList();

        TestPriorityQueue testPriorityQueue = new TestPriorityQueue();
        testPriorityQueue.DisplayPriorityQueue();

//        TestArrayDeque testArrayDeque = new TestArrayDeque();
//        testArrayDeque.DisplayArrayDeque();
//
//        TestPriorityBlockingQueue testPriorityBlockingQueue = new TestPriorityBlockingQueue();
//        testPriorityBlockingQueue.DisplayPriorityBlockingQueue();
    }
}

class TestLinkdedList{
    Queue<Integer> numbers = new LinkedList<>();
    public void DisplayLinkedList(){
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.offer(40);

        //display using for-each
        for(Integer i : numbers){
            System.out.println("display all element using for-each "+ i);
        }

        System.out.println("after add and offer " + numbers);


        System.out.println("use remove " + numbers.remove());

        System.out.println("use poll "+ numbers.poll());

        System.out.println("use element "+ numbers.element());

        System.out.println("use peek " + numbers.peek());

        System.out.println("collection after change " + numbers);
    }
}

class TestPriorityQueue{
    Queue<Integer> numbers = new PriorityQueue<>();

    public void DisplayPriorityQueue(){
        numbers.add(4);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        //display all using poll to arrange
        while (!numbers.isEmpty()){
            System.out.println(numbers.poll());
        }


//        //display after arrange
//        System.out.println(numbers);
//        //display using for-each
//        for(Integer i : numbers){
//            System.out.println("display all element using for-each "+ i);
//        }

//        System.out.println("after add and offer " + numbers);
//
//        System.out.println("use remove " + numbers.remove());
//
//        System.out.println("use poll "+ numbers.poll());
//
//        System.out.println("use element "+ numbers.element());
//
//        System.out.println("use peek " + numbers.peek());
//
//        System.out.println("collection after change " + numbers);
    }
}

class TestArrayDeque{
    Queue<Integer> numbers = new ArrayDeque<>();

    public void DisplayArrayDeque(){
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.offer(4);

        for(Integer i : numbers){
            System.out.println("display all element using for-each "+ i);
        }

        System.out.println("after add and offer " + numbers);

        System.out.println("use remove " + numbers.remove());

        System.out.println("use poll "+ numbers.poll());

        System.out.println("use element "+ numbers.element());

        System.out.println("use peek " + numbers.peek());

        System.out.println("collection after change " + numbers);
    }
}

class TestPriorityBlockingQueue{
    Queue<Integer> numbers = new PriorityBlockingQueue<>();

    public void DisplayPriorityBlockingQueue(){
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.offer(4);

       for (Integer i : numbers){
            System.out.println("display all element using for-each "+ i);
        }

        System.out.println("after add and offer " + numbers);

        System.out.println("use remove " + numbers.remove());

        System.out.println("use poll "+ numbers.poll());

        System.out.println("use element "+ numbers.element());

        System.out.println("use peek " + numbers.peek());

        System.out.println("collection after change " + numbers);

    }
}