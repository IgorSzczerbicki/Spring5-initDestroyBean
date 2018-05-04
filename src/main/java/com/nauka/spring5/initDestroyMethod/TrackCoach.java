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
	
	//metoda inicjalizuj�ca
	public void init() {
		System.out.println("TrackCoach: init method");
	}
	
	//metoda zamykaj�ca
	public void destroy() {
		System.out.println("TrackCoach: destroy method");
	}
}
