package com.rahul.design.elevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevatorApplication {


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int noOfFloor= scanner.nextInt();
        int noOfElevator= scanner.nextInt();
        List<Thread> elevators=new ArrayList<>();
        for (int i = 0; i <noOfElevator ; i++) {
            Thread thread=new Thread(new Elevator(new Integer(i).toString(),noOfFloor));
            elevators.add(thread);
        }
        elevators.stream().forEach(elevator -> {
            elevator.start();
        });

        while (true){
            //scanner.next()
        }
    }
}
