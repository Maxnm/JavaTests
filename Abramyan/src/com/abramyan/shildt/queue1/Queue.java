package com.abramyan.shildt.queue1;

/**
 * @Author Max
 * @Date 21.09.2015
 * @Version JDK 1.8
 * @Purpose Education
 */

//Organization of queue

public class Queue {
    char q[];   //Array for place in queue
    int putLoc, getLoc; //Indexes for position in queue

    Queue(int size) {
        q = new char[size + 1]; //Allocation of memory for array
        putLoc = getLoc = 0;
    }

    //Putting symbol into a queue
    void put(char ch) {
        if (putLoc == q.length - 1) {
            System.out.println("Queue is full");
            return;
        }
        putLoc++;
        q[putLoc] = ch;

    }

    //getting of a symbol from the queue
    char get(){
        if (getLoc == putLoc){
            System.out.println("Queue is empty");
            return(char)0;
        }
        getLoc++;
        return q[getLoc];
    }
}
