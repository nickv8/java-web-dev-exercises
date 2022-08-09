package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;

public class MultipleChoice extends Question{

    String answer;

    ArrayList<String> options;

    public MultipleChoice(String question, int pointValue, String answer, ArrayList<String> answerOptions) {
        super(question, pointValue, answerOptions, answer);
        this.answer = answer;

    }



    @Override
    public boolean answer(String userInput) {
        return answer == userInput;
    }
}
