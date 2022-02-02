package spring.di.ui;

import spring.entitiy.Exam;
import spring.ui.ExamConsole;

public class GridConsole implements ExamConsole {
	private Exam exam;
	
	public GridConsole(Exam exam) {
		this.exam = exam;
	}

	@Override
	public void print() {
		System.out.println("__________________");
		System.out.println("|       |         |");
		System.out.println("| total |   avg   |");
		System.out.println("|_______|_________|");
		System.out.println("|       |         |");
		System.out.printf(" | %3d   |   %3.2f |\n", exam.total(), exam.avg());
		System.out.println("|_______|_________|");
	}

}
