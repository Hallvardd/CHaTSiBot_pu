package com.example.taphan.core1.questionDatabase;


import com.google.firebase.database.DatabaseReference;

public class Question {

    // A question can only have one answer and refer to only one course.

    private String questionID; //key
    private String questionTxt;
    private String refAnsID;
    private DatabaseReference questionPath;

    public Question(){

    }

    public Question(String questionID, String questionTxt, DatabaseReference questionPath){
        this.questionID = questionID;
        this.questionTxt = questionTxt;
        this.questionPath = questionPath;

    }

    public String getQuestionID(){
        return questionID;
    }

    public void setQuestionID(String questionID) {
        this.questionID = questionID;
    }

    public String getRefAnsID() {
        return refAnsID;
    }

    public void setRefAnsID(String refAnsID) {
        this.refAnsID = refAnsID;
    }

    public String getQuestionTxt() {
        return questionTxt;
    }

    public void setQuestionTxt(String question) {
        this.questionTxt = question;
    }

    public void setQuestionPath(DatabaseReference questionPath){
        this.questionPath = questionPath;
    }
    public DatabaseReference getQuestionPath(){
        return  questionPath;
    }

}

