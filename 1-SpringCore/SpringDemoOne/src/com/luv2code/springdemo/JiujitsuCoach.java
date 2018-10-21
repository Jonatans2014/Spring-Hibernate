package com.luv2code.springdemo;

public class JiujitsuCoach  implements Coach{
    @Override
    public String getDailyWorkout() {
        return "I will choke you out";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
