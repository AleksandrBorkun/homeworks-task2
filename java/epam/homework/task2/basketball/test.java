package epam.homework.task2.basketball;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {

		Basket b = new Basket();
		
		int i[] = b.fillTheBasket(9, 5, 11, 7, 10);

		System.out.println(Arrays.toString(i));

	}

}
