package com.nauka.spring5.initDestroyMethod;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {}

	@Override
	public String getDailyWorkout() {
		return "Plan treningu dla biegania";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
