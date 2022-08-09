package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;

public abstract class Question {

    String question;

    Integer pointValue;

    ArrayList<String> answerOptions;

    String answer;


    public Question(String question, int pointValue, ArrayList<String> answerOptions, String answer) {
        this.question = question;
        this.pointValue = pointValue;
        this.answerOptions = answerOptions;
        this.answer = answer;
    }

    public abstract boolean answer(String userInput);



    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Integer getPointValue() {
        return pointValue;
    }

    public void setPointValue(Integer pointValue) {
        this.pointValue = pointValue;
    }

    public ArrayList<String> getAnswerOptions() {
        return answerOptions;
    }

    public void setAnswerOptions(ArrayList<String> answerOptions) {
        this.answerOptions = answerOptions;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
