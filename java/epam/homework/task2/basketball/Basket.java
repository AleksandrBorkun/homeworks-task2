package epam.homework.task2.basketball;

public class Basket {

	private int sumOfWeight;
	private int resultArray[] = new int[2];

	public int[] fillTheBasket(int countOfGreenBalls, int countOfRedBalls, int countOfBlueBalls, int countOfOrangeBalls,
			int weigthOfOneBall) {

		Ball green = new Ball("Green", weigthOfOneBall);
		Ball red = new Ball("Red", weigthOfOneBall);
		Ball blue = new Ball("Blue", weigthOfOneBall);
		Ball orange = new Ball("Orange", weigthOfOneBall);

		sumOfWeight = countOfGreenBalls * green.getBallWeight() + countOfRedBalls * red.getBallWeight()
				+ countOfBlueBalls * blue.getBallWeight() + countOfOrangeBalls * orange.getBallWeight();

		resultArray[0] = sumOfWeight;
		resultArray[1] = countOfBlueBalls;

		return resultArray;

	}

}

