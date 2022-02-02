package spring.di.ui;

import spring.entitiy.Exam;
import spring.ui.ExamConsole;

public class InlineExamConsole implements ExamConsole {

	private Exam exam;
		
	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}

	@Override
	public void print() {
		System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
	}

}
