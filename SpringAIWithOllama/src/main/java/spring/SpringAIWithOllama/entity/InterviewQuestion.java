package spring.SpringAIWithOllama.entity;

public class InterviewQuestion {

	String question;
	String answer;
	String difficulty_level;
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getDifficulty_level() {
		return difficulty_level;
	}
	public void setDifficulty_level(String difficulty_level) {
		this.difficulty_level = difficulty_level;
	}
	public InterviewQuestion() {
		super();
	}
	public InterviewQuestion(String question, String answer, String difficulty_level) {
		super();
		this.question = question;
		this.answer = answer;
		this.difficulty_level = difficulty_level;
	}
	@Override
	public String toString() {
		return "InterviewQuestion [question=" + question + ", answer=" + answer + ", difficulty_level="
				+ difficulty_level + "]";
	}
	
	
}
