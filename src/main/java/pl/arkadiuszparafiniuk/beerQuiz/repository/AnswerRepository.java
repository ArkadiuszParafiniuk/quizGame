package pl.arkadiuszparafiniuk.beerQuiz.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.arkadiuszparafiniuk.beerQuiz.model.Answer;
import pl.arkadiuszparafiniuk.beerQuiz.model.Question;

@Repository
public interface AnswerRepository extends CrudRepository<Answer, Long> {

    Answer findByQuestion(Question question);

}
