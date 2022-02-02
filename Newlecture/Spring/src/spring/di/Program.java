package spring.di;

import spring.di.ui.GridConsole;
import spring.di.ui.InlineExamConsole;
import spring.entitiy.Exam;
import spring.entity.NewlecExam;
import spring.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		
		Exam exam = new NewlecExam();
//		ExamConsole console = new InlineExamConsole(exam); //DI
		ExamConsole console = new GridConsole(exam);
		console.print();
	}

}
