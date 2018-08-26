package pl.arkadiuszparafiniuk.beerQuiz.service;

import org.springframework.stereotype.Service;
import pl.arkadiuszparafiniuk.beerQuiz.model.Question;
import pl.arkadiuszparafiniuk.beerQuiz.repository.QuestionRepository;

import javax.annotation.Resource;

/**
 * Class created by Arkadiusz Parafiniuk
 * @Author arkadiusz.parafiniuk@gmail.com
 */

@Service
public class QuestionsBaseServiceImpl implements QuestionsBaseService {

    @Resource
    QuestionRepository questionRepository;

    @Override
    public int getAmountOfQuestions() {
        return questionRepository.countUsers();
    }

    @Override
    public void addQuestion(Question question) {
        questionRepository.save(question);
    }

    @Override
    public void removeQuestion(Question question) {
        //to do
    }

    @Override
    public void removeQuestionByQuestionNumber(int questionNumber) {
        //to do
    }
}
