package com.luv2code.springdemo;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


//step1 define the dependency interface and class

@Component
@Scope("singleton")
public class TennisCoach implements Coach {


    //field Injection
    @Qualifier("ramdomService")
    @Autowired
    private  FortuneService fortuneService;
    //Step2. Create a constructor in your class for injections
    //step3 Configure dependency injection with @Autowired annonation

    /*Development process Setter injection
     * 1.Create settter metho in your class for injections
     * 2. Configure the depency injection with @autowired Annoation
     */

    //Using setter Injection
    //define a default constructor
    //1.Create settter method in your class for injections

    /*public  TennisCoach(){

        System.out.println(">> TennisCoach: Inside Deafult const");
    }*/

    //define a setter method
    // 2. Configure the depency injection with @autowired Annoation


    /*
    @Autowired
    public  void setFortuneService(FortuneService theFortuneService)
    {
        System.out.println(">> TennisCoach: Inside setFortuneService const");
        fortuneService = theFortuneService;
    }*/


    // Using Consrtuction Injection
    /*
    @Autowired
    public  TennisCoach(FortuneService theFortuneService){

        fortuneService = theFortuneService;
    }*/


    @PostConstruct
    public void doStartup()
    {
        System.out.println("Start it");
    }

    @PreDestroy
    public void doEndIt()
    {
        System.out.println("End it");
    }


    @Override
    public String getDailyWorkout() {
        return "Practice your backend volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}


