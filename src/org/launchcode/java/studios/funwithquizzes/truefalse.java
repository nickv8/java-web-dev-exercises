package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;

public class truefalse extends Question {



    public truefalse(String question, int pointValue, ArrayList<String> answerOptions) {
        super(question, pointValue, answerOptions, "");

    }

    @Override
    public boolean answer(String UserInput) {

        return answer == UserInput;
    }




}
