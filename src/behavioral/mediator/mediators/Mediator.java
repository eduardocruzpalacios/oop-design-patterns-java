package behavioral.mediator.mediators;

import behavioral.mediator.model.Message;
import behavioral.mediator.participants.Participant;

public interface Mediator {

	public void link(Participant participant);

	public void unlink(Participant participant);

	public void notifyOne(Message message, Participant participant);

	public void notifyAll(Message message);

}
