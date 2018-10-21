package com.luv2code.springdemo;

public class BaseballCoach implements Coach{



    //define a private field for dependency
    //String will construct our object and it will pass in a  dependency
    //Then We Acceot and assign IT, this is dependency injection
    private FortuneService fortuneService;


    //define a constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService)
    {
        this.fortuneService =  theFortuneService;
    }
    @Override
    public String getDailyWorkout(){

        return " Spend 30 min on batting practice";
    }

    @Override
    public String getDailyFortune() {

        //dependecy = helper
        return fortuneService.getFortune();
    }


}
