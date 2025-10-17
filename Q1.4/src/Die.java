
public class Die {
	private int numOfSides;
	private int[] statistics;
	int lastToss;

	public Die() {
		this(6);
	}

	public Die(int n) {
		numOfSides = n;
		statistics = new int[numOfSides];
	}

	public int rollDie(boolean unique) {
		int result;
		result = 1 + (int) (Math.random() * numOfSides);
		if (unique == true) {
			while (result == lastToss) {
				result = 1 + (int) (Math.random() * numOfSides);
			}
		}
		statistics[result - 1]++;
		lastToss = result;
		return result;
	}

	public void showStatistics() {
		int i;
		for (i = 0; i < numOfSides; i++) {
			System.out.println(i + 1 + ":" + statistics[i]);
		}
		System.out.println("MOST FREQUENT DIGIT IS :" + this.getMostFrequent());
	}

	public int getMostFrequent() {
		int index = 0;
		int bestIndex = 0;

		for (int i = 0; i < numOfSides; i++) {
			if (statistics[i] > index) {
				index = statistics[i];
				bestIndex = i + 1;
			}
		}
		return bestIndex;
	}

	public int[] getAllMostFrequents() {
		int maxValue = 0;

		for (int i = 0; i < numOfSides; i++) {

			if (statistics[i] > maxValue) {
				maxValue = statistics[i];
			}
		}

		int count = 0;
		for (int j = 0; j < numOfSides; j++) {
			if (statistics[j] == maxValue) {
				count++;
			}

		}

		int[] bestIndexArray = new int[count];
		int index = 0;
		for (int k = 0; k < numOfSides; k++) {
			if (statistics[k] == maxValue) {
				bestIndexArray[index++] = k + 1;

			}
		}
		return bestIndexArray;
	}

}
