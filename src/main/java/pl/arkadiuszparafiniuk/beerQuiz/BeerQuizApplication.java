package pl.arkadiuszparafiniuk.beerQuiz;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import pl.arkadiuszparafiniuk.beerQuiz.service.GameService;
import pl.arkadiuszparafiniuk.beerQuiz.service.GameServiceImpl;
import pl.arkadiuszparafiniuk.beerQuiz.service.QuestionsBaseService;

import javax.annotation.Resource;

@SpringBootApplication
public class BeerQuizApplication {

	@Resource
	QuestionsBaseService questionsBaseService;

	@Resource
	GameService gameService;

	public static void main(String[] args) {
		SpringApplication.run(BeerQuizApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.printf("Amount of questions: " + questionsBaseService.getAmountOfQuestions());
			System.out.printf("Question: " + gameService.getRandomQuestion());

		};
	}
}
