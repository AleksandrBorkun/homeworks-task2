package epam.homework.task2.ProgrammerBook;

import static java.lang.System.out;

public class chekThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProgrammerBook p = new ProgrammerBook("Prog Book", "Savin", "RUS", 1, 150, 2, 1);
		ProgrammerBook p2 = new ProgrammerBook("Java", "G.Shild", "ENG", 2, 2500, 8, 1);

		out.println(p.equals(p2));
		out.println(p.hashCode());
		out.println(p2.hashCode());
		out.println(p.toString());
		out.print(p2.toString());

	}

}
