package Test;

import Questions.QuestionGenerate;

import java.util.Scanner;

public class TestStart {

    QuestionGenerate questionGenerate = new QuestionGenerate();
    Scanner scanner = new Scanner(System.in);

    int countCorrectAnswer = 0;

    public void chooseQuestion(){
        for (int i = 0; i < 10; i++) {

            questionGenerate.showQuestion();
            System.out.println("Введите ответ цифрами от 1 до 4");
            int inputAnswer = scanner.nextInt();

            if (inputAnswer == questionGenerate.correctAnswer) {
                countCorrectAnswer++;
            }
        }
        System.out.println("Вы ответили на " + countCorrectAnswer * 10 + " % вопросов.");
    }
}
