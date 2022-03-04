package behavioral.mediator.model;

import java.time.LocalDate;

import behavioral.mediator.participants.Participant;

public class Message {

	private String value;
	private Participant participant;
	private LocalDate localDate;

	public Message() {
	}

	public Message(String value, Participant participant, LocalDate localDate) {
		this.value = value;
		this.participant = participant;
		this.localDate = localDate;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}

	public Participant getParticipant() {
		return participant;
	}

	public void setParticipant(Participant participant) {
		this.participant = participant;
	}

	@Override
	public String toString() {
		return "Message [value=" + value + ", participant=" + participant + ", localDate=" + localDate + "]";
	}

}
