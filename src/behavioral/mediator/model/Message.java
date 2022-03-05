package behavioral.mediator.model;

import java.time.LocalDateTime;

import behavioral.mediator.participants.Participant;

public class Message {

	private String value;
	private Participant participant;
	private LocalDateTime localDateTime;

	public Message() {
	}

	public Message(String value, Participant participant, LocalDateTime localDateTime) {
		this.value = value;
		this.participant = participant;
		this.localDateTime = localDateTime;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	public Participant getParticipant() {
		return participant;
	}

	public void setParticipant(Participant participant) {
		this.participant = participant;
	}

	@Override
	public String toString() {
		return "Message [value=" + value + ", participant=" + participant + ", localDateTime=" + localDateTime + "]";
	}

}
