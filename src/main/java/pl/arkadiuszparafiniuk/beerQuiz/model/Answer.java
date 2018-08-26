package pl.arkadiuszparafiniuk.beerQuiz.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Class created by Arkadiusz Parafiniuk
 * @Author arkadiusz.parafiniuk@gmail.com
 */
@Entity
@Table
public class Answer {

    @Id
    @Column
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Question question;

    @NotNull
    private String answer;

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
