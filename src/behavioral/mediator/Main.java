package behavioral.mediator;

import java.time.LocalDateTime;

import behavioral.mediator.colleagueclass.Participant;
import behavioral.mediator.concretecolleagueclass.ChatUser;
import behavioral.mediator.concretemediator.ChatRoom;
import behavioral.mediator.mediator.Mediator;
import behavioral.mediator.model.Message;

public class Main {

	public static void main(String[] args) {

		// a chat room is created
		Mediator chatRoom = new ChatRoom("1");

		/*
		 * users are created and they join the chat room. The join happens when ChatUser
		 * instance is initialized as Mediator link method is called.
		 */
		Participant user1 = new ChatUser(chatRoom, "Jean", 0);
		Participant user2 = new ChatUser(chatRoom, "Michael", 1);
		Participant user3 = new ChatUser(chatRoom, "Xavier", 2);

		// a message is sent to the 3 participants in the chat room
		Message message1 = new Message("Hi all!", user1, LocalDateTime.now());
		user1.operateAll(message1);

		// a message is sent to one participant in the chat room
		Message message2 = new Message("Hi all!", user2, LocalDateTime.now());
		user2.operateOne(message2, user3);

		/*
		 * an user exits the chat room. The Mediator unlink method is called behind the
		 * scenes
		 */
		user1.disconnect();

		// a message is sent to the 2 left participants in the chat room
		Message message3 = new Message("Boooo", user3, LocalDateTime.now());
		user3.operateAll(message3);

		/*
		 * in case a new concrete participant is needed, the maintainer must:
		 *
		 * - create the class in concretecolleagueclass package implementing Participant
		 * interface. Doing so, current concrete mediator could work with it
		 *
		 * in case a new concrete mediator is needed, the maintainer must:
		 *
		 * - create the class in concretemediator package implementing Mediator
		 * interface. Doing so, this could work with current concrete colleague classes
		 */

	}

}
