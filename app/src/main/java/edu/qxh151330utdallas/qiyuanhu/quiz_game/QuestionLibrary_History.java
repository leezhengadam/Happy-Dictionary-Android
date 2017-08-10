package edu.qxh151330utdallas.qiyuanhu.quiz_game;

/**
 * Created by huqiy on 4/17/2017.
 */

public class QuestionLibrary_History {

    private String mQuestions [] = {

            "1. What is the capital city of America ?",

            "2. Who was the first American president ?",

            "3. When was the declaration of independence ?",

            "4. Who is the president of America in year 2003 ?",

            "5. Which explorer discovered America ?",

            "6. How many stripes are displayed on the American flag ?",

            "7. Which president was responsible for freeing the slaves ?",

            "8. What is the largest state by area in America ?",

            "9. How many stars are displayed on the American flag ?",

            "10. What is the second most spoken language in America ?",

            "10. What is the second most spoken language in America ?",
    };

    private String mChoices [] [] = {
            {"Chicago, IL", "Washington, DC", "New York, NY"},
            {"George Washington", "Thomas Jefferson", "John Adams"},
            {"July 4, 1774", "July 6, 1774", "July 4, 1776"},
            {"George W. Bush", "Bill Clinton", "Barack Obama"},
            {"Marco Polo", "Christopher Columbus", "Francis Drake"},
            {"12", "13", "14"},
            {"Theodore Roosevelt", "Abraham Lincoln", "Grover Cleveland"},
            {"Texas", "California", "Alaska"},
            {"52", "51", "50"},
            {"Chinese", "Spanish", "French"},
            {"Chinese", "Spanish", "French"},
    };

    private String mCorrectAnswers [] = {"Washington, DC", "George Washington", "July 4, 1776",
            "George W. Bush", "Christopher Columbus", "13",
            "Abraham Lincoln", "Alaska", "50",
            "Spanish", "Spanish"};

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
