package behavioral.mediator.concretemediator;

import java.util.HashMap;
import java.util.Map;

import behavioral.mediator.colleagueclass.Participant;
import behavioral.mediator.mediator.Mediator;
import behavioral.mediator.model.Message;

public class ChatRoom implements Mediator {

	private String name;
	private Map<Integer, Participant> chatUsers;

	public ChatRoom(String name) {
		this.name = name;
		this.chatUsers = new HashMap<Integer, Participant>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<Integer, Participant> getChatUsers() {
		return chatUsers;
	}

	public void setChatUsers(Map<Integer, Participant> chatUsers) {
		this.chatUsers = chatUsers;
	}

	@Override
	public void link(Participant participant) {
		this.getChatUsers().put(participant.getId(), participant);
	}

	@Override
	public void unlink(Participant participant) {
		this.getChatUsers().remove(participant.getId());
	}

	@Override
	public void notifyOne(Message message, Participant participant) {
		System.out.println(message + " was sent to participant " + participant.getId());
	}

	@Override
	public void notifyAll(Message message) {
		this.chatUsers.keySet().forEach(k -> {
			System.out.println(this.chatUsers.get(k) + " get " + message);
		});
	}

}
