package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;
import java.util.Arrays;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz newQuiz = new Quiz();
        ArrayList<String> x = new ArrayList<String>(Arrays.asList("True", "False"));
        newQuiz.questions.add(new truefalse("Is the sky blue?", 1, x));
    }


}
