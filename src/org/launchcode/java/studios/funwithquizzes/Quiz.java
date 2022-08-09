package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

private Integer score;
    public ArrayList<Question> questions = new ArrayList<>();


    public void askingQuestions() {
        for(Question question : questions) {
            System.out.println(question.getQuestion());
            Scanner userInput = new Scanner(System.in);
            if(question.answer(userInput.nextLine())){
                score += question.pointValue;
            }
        }
    }

    public void displayScore() {
        System.out.println("Your score is: " + this.score);
    }
}
