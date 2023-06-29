package com.map;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Answer {

	@Id
	@Column(name = "answer_id")
	private int answerId;
	private String answer;
	
	@ManyToOne // is line se answer table me foreign key bana dega.
//	@OneToOne(mappedBy = "answer")// agar question table me Answer nam ki foreign key ban rahi hai to is line se answer table me foreign key nahi banayega
	private Question question;
	
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public Answer(int answerId, String answer) {
		super();
		this.answerId = answerId;
		this.answer = answer;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
