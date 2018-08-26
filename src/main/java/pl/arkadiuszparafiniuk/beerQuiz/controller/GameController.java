package pl.arkadiuszparafiniuk.beerQuiz.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.arkadiuszparafiniuk.beerQuiz.model.Answer;
import pl.arkadiuszparafiniuk.beerQuiz.model.Question;
import pl.arkadiuszparafiniuk.beerQuiz.service.GameService;
import pl.arkadiuszparafiniuk.beerQuiz.service.GameServiceImpl;

import javax.annotation.Resource;

/**
 * Class created by Arkadiusz Parafiniuk
 *
 * @Author arkadiusz.parafiniuk@gmail.com
 */

@RestController
@RequestMapping("/api")
public class GameController {

    private static final Log LOG = LogFactory.getLog(GameController.class);

    @Resource
    GameService gameService;

    @RequestMapping(value = "/getRandomQuestion/", method = RequestMethod.GET)
    public ResponseEntity<Question> getRandomQuestion() {
        LOG.info("GET /api/getRandomQuestion/");
        Question question = gameService.getRandomQuestion();
        return new ResponseEntity<>(question, HttpStatus.OK);
    }

    @RequestMapping(value = "/getAnswerByQuestionNumber/{questionNumber}", method = RequestMethod.GET)
    public ResponseEntity<Answer> getAnswerByQuestionNumber(@PathVariable("questionNumber") int questionNumber) {
        LOG.info("GET /api/getAnswerByQuestionNumber/" + questionNumber);
        Answer answer = gameService.findAnswerByQuestionNumber(questionNumber);
        return new ResponseEntity<>(answer, HttpStatus.OK);
    }

}
