package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class RamdomFortuneService implements FortuneService {

    //declare a Linked List
    LinkedList <String> RfortuneService = new LinkedList<String>();

    //Declare Radmon variable
    Random random = new Random();



    @Override
    public String getFortune() {
        //ADD strings to Linked List
        RfortuneService.add("do 500 push ups");
        RfortuneService.add("Train Jiu jitsu");
        RfortuneService.add("Do Well in College");

        //Generate Random Values
        int index =  random.nextInt(RfortuneService.size());

        //assign a string from linked list to fortune
        String fortune = RfortuneService.get(index);


        return fortune;
    }
}
