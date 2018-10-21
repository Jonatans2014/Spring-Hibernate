package com.luv2code.springdemo;

public class CricketCoach implements Coach {

    //we need a helper here
    private FortuneService fortuneService;


    public void setTeam(String team) {

        System.out.println("CricketCoach I am the best java developer and In setter Team");

        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach I am the best java developer and In setter EmailAdddress");

        this.emailAddress = emailAddress;
    }

    //add new fields for emailAddress and team
    private String emailAddress;
    private String team;

    public CricketCoach() {

        System.out.println("CricketCoach I am the best java developer");
    }

    //Our setter method called by spring when it injects the dependency
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach I am the best java developer and In setter Method");


        this.fortuneService = fortuneService;
    }
    //create a no arg constructor because Spring will call
    //this constructor when it make a reference to our beam
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
