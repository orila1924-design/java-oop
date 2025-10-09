
public class program {

	public static void main(String[] args) {
		Clock myClock = new Clock();
		Clock yourClock = new Clock();
		myClock.tick();
		myClock.show();
		myClock.setMidNight();
		myClock.show();
		myClock.setMidDay();
		myClock.show();
		yourClock.setMidNight();
		System.out.println("  now showing yourClock:");
		yourClock.show();

	}

}
