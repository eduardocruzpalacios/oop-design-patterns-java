package behavioral.mediator.mediator;

import behavioral.mediator.colleagueclass.Participant;
import behavioral.mediator.model.Message;

public interface Mediator {

	public void link(Participant participant);

	public void unlink(Participant participant);

	public void notifyOne(Message message, Participant participant);

	public void notifyAll(Message message);

}
