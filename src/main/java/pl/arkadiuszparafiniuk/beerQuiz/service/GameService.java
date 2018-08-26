package pl.arkadiuszparafiniuk.beerQuiz.service;

import org.springframework.stereotype.Service;
import pl.arkadiuszparafiniuk.beerQuiz.model.Answer;
import pl.arkadiuszparafiniuk.beerQuiz.model.Question;

/**
 * Class created by Arkadiusz Parafiniuk
 * @Author arkadiusz.parafiniuk@gmail.com
 */

public interface GameService {

    Question getRandomQuestion();

    Answer findAnswerByQuestionNumber(int questionNumber);

}
