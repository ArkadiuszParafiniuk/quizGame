package pl.arkadiuszparafiniuk.beerQuiz.service;

import org.springframework.stereotype.Service;
import pl.arkadiuszparafiniuk.beerQuiz.model.Question;

/**
 * Class created by Arkadiusz Parafiniuk
 * @Author arkadiusz.parafiniuk@gmail.com
 */

public interface QuestionsBaseService {

    int getAmountOfQuestions();

    void addQuestion(Question question);

    void removeQuestion(Question question);

    void removeQuestionByQuestionNumber(int questionNumber);

}
