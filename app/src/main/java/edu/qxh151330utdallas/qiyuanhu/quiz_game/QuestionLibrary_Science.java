package edu.qxh151330utdallas.qiyuanhu.quiz_game;

/**
 * Created by huqiy on 4/8/2017.
 */

public class QuestionLibrary_Science {

    private String mQuestions [] = {

            "1. Squirrel monkey is a type of ____?",

            "2. An instrument to measure temperature is called ____ ?",

            "3. Another name for a twister is ____",

            "4. ____ is a bird born out of the largest egg in the world",

            "5. The seventh planet from the sun is ____",

            "6. Albatross is ____?",

            "7. ____ bears the closest resemblance to man",

            "8. ____ is known as the ship of the desert",

            "9. The planet closest to the sun is____",

            "10. The blanket of air that envelops the earth is called ____ ?",

            "10. The blanket of air that envelops the earth is called ____ ?",
    };

    private String mChoices [] [] = {
            {"Squirrel", "Lizard", "Monkey"},
            {"Hydrometer", "Thermometer", "Tempometer"},
            {"Earthquake", "Tornado", "Wind"},
            {"Sparrow", "Turkey", "Ostrich"},
            {"Earth", "Uranus", "Mars"},
            {"A sea bird", "A beetle", "A fruit"},
            {"Panda", "Rhino", "Chimpanzee"},
            {"Cat", "Panther", "Camel"},
            {"Neptune", "Mercury", "Venus"},
            {"Upper crust", "Hydrosphere", "Atmosphere"},
            {"Upper crust", "Hydrosphere", "Atmosphere"},
    };

    private String mCorrectAnswers [] = {"Monkey", "Thermometer", "Tornado",
                                         "Ostrich", "Uranus", "A sea bird",
                                         "Chimpanzee", "Camel", "Mercury",
                                         "Atmosphere", "Atmosphere"};

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
