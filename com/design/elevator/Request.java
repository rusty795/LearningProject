package com.rahul.design.elevator;

public class Request implements Comparable{
    int currentFloor;
    Going towards;

    public Request(int currentFloor, Going towards) {
        this.currentFloor = currentFloor;
        this.towards = towards;
    }

    @Override
    public int compareTo(Object o) {
        Request request=(Request)o;

        if(this.towards==request.towards){
         return this.currentFloor-request.currentFloor;
        }else{
            return 1;
        }
    }
}
