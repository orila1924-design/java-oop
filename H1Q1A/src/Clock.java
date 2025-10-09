
public class Clock {
		int minutes;
		int seconds;
		int milliseconds;
		int hours;

		public void tick() {
			milliseconds = milliseconds + 1;

			seconds = seconds + milliseconds / 1000;
			milliseconds = milliseconds % 1000;

			minutes = minutes + seconds / 60;
			seconds = seconds % 60;

			hours = hours + minutes / 60;
			hours = hours % 24;
		}

		public void show() {
			System.out.printf("   "+hours+":"+minutes+":"+seconds+":"+milliseconds);
		}
		public void setMidNight() {
			System.out.println("   Clock has been set to Mid-Night");
			minutes=0;
			seconds=0;
			milliseconds=0;
			hours=0;
		}
		public void setMidDay() {
			System.out.println("   clock has been set to Mid-Day");
			minutes=00;
			seconds=00;
			milliseconds=00;
			hours=12;
		}
	}

