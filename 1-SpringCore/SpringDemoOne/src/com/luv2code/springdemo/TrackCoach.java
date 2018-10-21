package com.luv2code.springdemo;

public class TrackCoach implements Coach {

    //
    private FortuneService theFortuneService;

    //implement a constructor

    public TrackCoach(){
        // this is kind of a hack not totally Ideal.
    }

    public TrackCoach(FortuneService theFortuneService) {
        this.theFortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "You're doing Great Man. Keep attacking :D" +theFortuneService.getFortune();
    }


    //add an init method
    public void doMyStartupStuff()
    {
        System.out.println("TrackCoach: inaisw DO STARTUP");
    }

    //add a destroy method

    public void doMyCleanupStuffYoYo()
    {
        System.out.println("TrackCoach: inside cleanup startyoyo");
    }
    // add a destroy method
}
