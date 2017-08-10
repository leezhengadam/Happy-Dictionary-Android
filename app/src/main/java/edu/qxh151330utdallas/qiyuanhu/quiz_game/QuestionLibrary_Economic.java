package edu.qxh151330utdallas.qiyuanhu.quiz_game;

/**
 * Created by huqiy on 4/17/2017.
 */

public class QuestionLibrary_Economic {

    private String mQuestions [] = {

            "1. Economics is the study of ____",

            "2. The opportunity cost of a good is ____",

            "3. A market can accurately be described as ____",

            "4. In a free market ____",

            "5. A demand curve can shift because of changing ____",

            "6. Normative economics forms ____ based on ____",

            "7. Microeconomics is concerned with ____",

            "8. Macroeconomics is the study of ____",

            "9. If your income during one year is £10,000 and the following year it is £12,000, then it has grown by:",

            "10. The retail price index is used to ____",

            "10. The retail price index is used to ____",
    };

    private String mChoices [] [] = {
            {"production technology", "consumption decisions", "how society decides what, how, and for whom to produce"},
            {"time lost in finding it", "quantity of other goods sacrificed to get another unit of that good", "expenditure on the good"},
            {"a place to buy things", "a place to sell things", "process by which prices adjust to reconcile the allocation resources"},
            {"governments intervene", "governments plan production", "prices adjust to reconcile scarcity and desires"},
            {"incomes", "tastes & prices of related goods", "all of the above"},
            {"positive statements, facts", "opinions, personal values", "opinions, facts"},
            {"economy as a whole", " electronics industry", "study of individual economic behaviour"},
            {"individual building blocks in the economy", "household purchase decisions", "economy as a whole"},
            {"20%", "2%", "12%"},
            {"construct price lists", "measure changes in cost of living", "compare shop prices"},
            {"construct price lists", "measure changes in cost of living", "compare shop prices"},
    };

    private String mCorrectAnswers [] = {"how society decides what, how, and for whom to produce",
                                         "quantity of other goods sacrificed to get another unit of that good",
                                         "process by which prices adjust to reconcile the allocation resources",
                                         "prices adjust to reconcile scarcity and desires",
                                         "all of the above",
                                         "opinions, personal values",
                                         "the study of individual economic behaviour",
                                         "economy as a whole",
                                         "20%",
                                         "measure changes in cost of living",
                                         "measure changes in cost of living"};

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
