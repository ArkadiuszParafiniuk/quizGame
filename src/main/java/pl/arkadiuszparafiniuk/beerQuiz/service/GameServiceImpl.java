package pl.arkadiuszparafiniuk.beerQuiz.service;

import org.springframework.stereotype.Service;
import pl.arkadiuszparafiniuk.beerQuiz.model.Answer;
import pl.arkadiuszparafiniuk.beerQuiz.model.Question;
import pl.arkadiuszparafiniuk.beerQuiz.repository.AnswerRepository;
import pl.arkadiuszparafiniuk.beerQuiz.repository.QuestionRepository;

import javax.annotation.Resource;

/**
 * Class created by Arkadiusz Parafiniuk
 * @Author arkadiusz.parafiniuk@gmail.com
 */

@Service
public class GameServiceImpl implements GameService {

    @Resource
    QuestionRepository questionRepository;

    @Resource
    AnswerRepository answerRepository;

    @Resource
    QuestionsBaseService questionsBaseService;


    @Override
    public Question getRandomQuestion() {
        int amountOfQuestions = questionsBaseService.getAmountOfQuestions();
        int questionNumber = (int) Math. random() * amountOfQuestions + 1;
        return questionRepository.findByQuestionNumber(questionNumber);
    }

    @Override
    public Answer findAnswerByQuestionNumber(int questionNumber) {
        Question question = questionRepository.findByQuestionNumber(questionNumber);
        return answerRepository.findByQuestion(question);
    }
}
