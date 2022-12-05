package pro.wings.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	@Column(name = "Question_id")
	private int QuestionId;

	private String Question;

	@OneToOne
	private Answer answer;

	public int getQuestionId() {
		return QuestionId;
	}

	public void setQuestionId(int questionId) {
		QuestionId = questionId;
	}

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public Question() {
		// TODO Auto-generated constructor stub
	}

	public Question(int questionId, String question, Answer answer) {
		super();
		QuestionId = questionId;
		Question = question;
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [QuestionId=" + QuestionId + ", Question=" + Question + ", answer=" + answer + "]";
	}

}
