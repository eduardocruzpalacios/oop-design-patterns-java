package behavioral.mediator.participants;

import behavioral.mediator.mediators.Mediator;
import behavioral.mediator.model.Message;

public class ChatUser implements Participant {

	private Mediator mediator;
	private String name;
	private int id;

	public ChatUser() {
	}

	public ChatUser(Mediator mediator, String name, int id) {
		this.mediator = mediator;
		this.name = name;
		this.id = id;
		this.mediator.link(this);
	}

	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "ChatUser [name=" + name + ", id=" + id + "]";
	}

	@Override
	public void operateOne(Message message, Participant participant) {
		this.mediator.notifyOne(message, participant);
	}

	@Override
	public void operateAll(Message message) {
		this.mediator.notifyAll(message);
	}

	@Override
	public void disconnect() {
		this.mediator.unlink(this);
	}

}
