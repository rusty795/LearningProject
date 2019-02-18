package com.rahul.design.elevator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ElevatorMaster implements Runnable{
    List<Thread> elevators;

    Queue<Request> requestQueue=new LinkedList<>();

    public ElevatorMaster(List<Thread> elevators) {
        this.elevators= elevators;
    }

    Thread chooseElevator(Request request){
        Thread choosenElevator=chooseElevator();
        for (int i = 1; i <elevators.size() ; i++) {
            if(request.compareTo(elevators.get(i).)){

            }
        }
    }
    @Override
    public void run() {
        while (true) {
            if (requestQueue.isEmpty()) {
                this.wait(1000);
            }
            Request request=requestQueue.poll();



        }
    }
}

