package behavioral.mediator.participants;

import behavioral.mediator.model.Message;

public interface Participant {

	public int getId();

	public void operateOne(Message message, Participant participant);

	public void operateAll(Message message);

	public void disconnect();

}
