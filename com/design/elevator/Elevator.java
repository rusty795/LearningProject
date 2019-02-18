package com.rahul.design.elevator;

import java.util.LinkedList;
import java.util.Queue;

public class Elevator implements Runnable {

    String evevatorId;
    int currentFloor=0;
    int MAX_FLOOR;
    Going going;
    Queue<Request> requestQueue=new LinkedList<>();

    public Elevator(String evevatorId, int MAX_FLOOR) {
        this.evevatorId = evevatorId;
        this.MAX_FLOOR = MAX_FLOOR;
        this.going = Going.STAND;
    }

    @Override
    public void run() {
        while(true){
            requestQueue.isEmpty()
        }

    }


}
