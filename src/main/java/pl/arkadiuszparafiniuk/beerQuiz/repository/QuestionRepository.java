package pl.arkadiuszparafiniuk.beerQuiz.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.arkadiuszparafiniuk.beerQuiz.model.Question;

/**
 * Class created by Arkadiusz Parafiniuk
 * @Author arkadiusz.parafiniuk@gmail.com
 */
@Repository
public interface QuestionRepository extends CrudRepository<Question, Long> {

    Question save(Question question);

    Question findByQuestionNumber(int questionNumber);

    @Query("SELECT COUNT(q) FROM Question q")
    int countUsers();

}
