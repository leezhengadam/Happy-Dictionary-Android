package edu.qxh151330utdallas.qiyuanhu.quiz_game;

/**
 * Created by huqiy on 4/17/2017.
 */

public class QuestionLibrary_Computer {

    private String mQuestions [] = {

            "1. How do you open a program when there are no icons on the desktop ?",

            "2. How do you minimize or maximize a program in Windows ?",

            "3. A word processing file can be attached to an e-mail message ?",

            "4. Which of the following is an example of an e-mail address ?",

            "5. Which two websites offer free email service ?",

            "6. Which occupation would most likely use a database on the job ?",

            "7. A database program replaces what piece of office equipment ?",

            "8. In a database program, a set of related information is called:",

            "9. If a student sorted the following in descending order, which international capital would be first ? ",

            "10. All of the following are examples of electronic databases except which one ?",

            "10. All of the following are examples of electronic databases except which one ?",
    };

    private String mChoices [] [] = {
            {"Right click to reveal all icons.", "Restart the computer.", "Click the start button and select program from the menu."},
            {"Right click on the mouse.", "Top right corner, dash or square.", "This function can not be done."},
            {"Yes", "No","Depends on what type of file."},
            {"Jeandoe.gmail.com", "Bob Smith@yahoo.com", "Johndoe@cincinnatilibrary.org"},
            {"Yahoo and Amazon", "Yahoo and Google", "I-Tunes and Twitter"},
            {"An athlete", "Heavy equipment operator", "Telephone information operators"},
            {"Typewriter", "Photocopier", "Filing cabinet"},
            {"Field", "Entry", "Record"},
            {"Moscow", "Beirut", "Paris"},
            {"Collection of country music CDs", "A CD-Rom encyclopedia", "Computerized student information"},
            {"Collection of country music CDs", "A CD-Rom encyclopedia", "Computerized student information"},
    };

    private String mCorrectAnswers [] = {"Click the start button and select program from the menu.",
                                        "Top right corner, dash or square.",  "YES",
                                        "Johndoe@cincinnatilibrary.org", "Yahoo and Google", "Telephone information operators",
                                        "Filing cabinet", "Field","Paris",
                                        "Collection of country music CDs", "Collection of country music CDs"};

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String Choice0 = mChoices [a] [0];
        return Choice0;
    }

    public String getChoice2(int a) {
        String Choice1 = mChoices [a] [1];
        return Choice1;
    }

    public String getChoice3(int a) {
        String Choice2 = mChoices [a] [2];
        return Choice2;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }


}
